package authredirect.api.rest;

import java.net.URI;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Stateless
@Path("")
public class AuthorizeRestService {

	@Context
	private UriInfo uri;

	@GET
	@Path("authorize")
	public Response authorize(@QueryParam("redirect_uri") String redirect_uri) {
		// forward user to the login page with the desired redirect_uri as path param
		return Response.status(302)
				.header(HttpHeaders.LOCATION, URI.create(uri.getBaseUri() + "login?redirect_uri=" + redirect_uri))
				.build();
	}

	/**
	 * Login with username and password
	 *
	 * @return 200 OK
	 */
	@POST
	@Path("authenticate")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Response authenticate(@FormParam("name") String name,
			@FormParam("password") String password,
			@QueryParam("redirect_uri") String redirectUri) {
		// automatically accept all name/passwords for now and redirect to the desired resource URI
		return Response
				.status(302)
				.header(HttpHeaders.LOCATION, URI.create(redirectUri))
				.build();
	}

}
