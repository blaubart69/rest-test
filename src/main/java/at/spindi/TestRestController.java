package at.spindi;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/admins")
@RolesAllowed({"AdminRole"})
public class TestRestController {

	@GET
	@Produces("application/json")
	public User getTest() {
		return new User("hari", "frebort");
	}

}
