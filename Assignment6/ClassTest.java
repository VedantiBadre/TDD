package Assignment6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClassTest {

	Divisible d=new Divisible();
	@Test
	public void test_DivisibleBy7_Right() {
		assertEquals(d.add(), 500);
	}
	
	@Test
	public void test_DivisibleBy7_Wrong() {
		assertEquals(d.add(), 2107);
	}
}
