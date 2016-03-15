
import static org.junit.Assert.*;

import org.junit.Test;

public class multiplytest {
	
	Calculationmethod calc = new Calculationmethod();
	
	
	
	
	@Test
	public void test_mul1()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, 10, 4) < -90.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_mul2()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -40, 4)== 400.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_mul3()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(2.5, 2.5, 4) > 2.26);
		System.out.println("Its correct");
	}

	@Test
	public void test_mul4()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -10, 4)== 100.0);
		System.out.println("Its correct");
	}

	

}


