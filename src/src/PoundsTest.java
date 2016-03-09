import static org.junit.Assert.*;

import org.junit.Test;

public class PoundsTest {
	Pounds calc = new Pounds();
	String kilograms = calc.calculateKilograms(180.0);
	String result_k = "<Kilograms>82.0</Kilograms>";
	
	
	@Test
	public void test() {
		System.out.println("@Test calculateKilograms(): "+kilograms+" = "+result_k);
		assertEquals(kilograms, result_k);
	}

}
