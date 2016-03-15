
import static org.junit.Assert.*;

import org.junit.Test;

public class modulustest {
	
	Calculationmethod calc = new Calculationmethod();
	
	
	
	
	@Test
	public void test_mod1()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, 10, 5)!= -20.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_mod2()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -40, 5)!= 30.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_mod3()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(10.5, 15.5, 5)!= -5.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_mod4()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -10, 5)== 0.0);
		System.out.println("Its correct");
	}

	

}


