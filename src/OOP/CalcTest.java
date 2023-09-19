package OOP;

 

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
	
	@Test
	public void evalCalc() {
		Calc calc = new Calc();
		assertEquals(100, calc.getValue());
		
		
	}

}
