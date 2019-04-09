package authredirect.api.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;


@ApplicationPath("")
public class ApiRestApplication extends Application {

	protected void addResources(Set<Class<?>> resources) {
		resources.add(LoginRestService.class);
		resources.add(AuthorizeRestService.class);
	}
}
