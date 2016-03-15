import static org.junit.Assert.*;

import org.junit.Test;

public class additiontest {
	
	Calculationmethod calc = new Calculationmethod();
	
	
	
	
	@Test
	public void test_addtion1()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, 10, 1)== 0.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_addtion2()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, 30, 1)== 20.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_addtion3()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(10.5, 15.5, 1)== 26.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_addtion4()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -10, 1)== -20.0);
		System.out.println("Its correct");
	}

	

}
