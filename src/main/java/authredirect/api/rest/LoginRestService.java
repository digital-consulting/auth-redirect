package authredirect.api.rest;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.io.InputStream;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Stateless
@Path("")
public class LoginRestService {

	@Inject
	private ServletContext context;

	@GET
	@Path("login")
	public Response loginGet(@QueryParam("redirect_uri") String redirect_uri) {
		InputStream resource = context.getResourceAsStream("/WEB-INF/login.html");
		return null == resource ? Response.status(NOT_FOUND).build() : Response.ok().entity(resource).build();
	}
}
