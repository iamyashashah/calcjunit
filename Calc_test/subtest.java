
import static org.junit.Assert.*;

import org.junit.Test;

public class subtest {
	
	Calculationmethod calc = new Calculationmethod();
	
	
	
	
	@Test
	public void test_sub1()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, 10, 2)== -20.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_sub2()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -40, 2)== 30.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_sub3()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(10.5, 15.5, 2)== -5.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_sub4()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -10, 2)== 0.0);
		System.out.println("Its correct");
	}

	

}

