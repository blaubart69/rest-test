package at.spindi;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import jakarta.inject.Singleton;

@Path("/admins")
@RolesAllowed("Users")
@Singleton
public class TestRestController {

	@GET
	@Produces("application/json")
	public Response getTest() {
		return Response.ok(new User("hari", "frebort")).build();
	}

}
