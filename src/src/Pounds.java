import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/convert")
public class Pounds {

	@GET
	@Path("/pounds/{p}")
	@Produces("application/xml")
	public String calculateKilograms(@PathParam("p")Double p)
	{
		Double Kilograms = p/2.2046;
		Kilograms = (double) Math.round(Kilograms);
		return "<Kilograms>" + Kilograms + "</Kilograms>";
	}
}
