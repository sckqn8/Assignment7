import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/area")
public class Area {

	@GET
	@Path("/square/{s}")
	@Produces("application/xml")
	public String squareArea(@PathParam("s")int s)
	{
		int area = s*s;
		return "<Square>" + area + "</Square>";
	}
	
	@GET
	@Path("/rectangle/{l}/{b}")
	@Produces("application/xml")
	public String squareRectangle(@PathParam("l")int l, @PathParam("b")int b)
	{
		int area = l*b;
		return "<Rectangle>" + area + "</Rectangle>";
	}
}
