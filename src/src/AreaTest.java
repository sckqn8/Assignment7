import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {
	Area calculateArea = new Area();
	String square = calculateArea.squareArea(6);
	String rectangle = calculateArea.squareRectangle(6, 3);
	String squarer = "<Square>6</Square>";
	String rectangler = "<Rectangle>18</Rectangle>";
	
	@Test
	public void testSquareArea() {
		System.out.println("@Test: "+square+" = "+squarer);
		assertEquals(square, squarer);
	}

	@Test
	public void testSquareRectangle() {
		System.out.println("@Test: "+rectangle+" = "+rectangler);
		assertEquals(rectangle, rectangler);
		
	}

}
