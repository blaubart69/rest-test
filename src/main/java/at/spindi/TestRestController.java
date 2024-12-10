package at.spindi;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/admins")
@RolesAllowed({"AdminRole"})
public class TestRestController {

	@GET
	@Produces("application/json")
	public User getTest() {
		return new User("hari", "frebort");
	}

}
