package OOP;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokeTest {
 



	@Test
	public void calculateString() {
		JokeManager jm = new JokeManager();

		jm.addJoke("Hello");
		System.out.println("test");
		assertEquals("Hellso", jm.drawJoke());
	}
	
	@Test
	public void testOne() {
		JokeManager jm = new JokeManager();
		assertEquals(1, jm.one());
		
	}
	

}
