
import static org.junit.Assert.*;

import org.junit.Test;

public class divisontest {
	
	Calculationmethod calc = new Calculationmethod();
	
	
	
	
	@Test
	public void test_div1()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, 10, 3)== -1.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_div2()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-40, -10, 3)== 4.0);
		System.out.println("Its correct");
	}

	@Test
	public void test_div3()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(5, 2, 3)== 2.5);
		System.out.println("Its correct");
	}

	@Test
	public void test_div4()
	{
		System.out.println("test the result is right or wrong");
		assertTrue(calc.Calc(-10, -10, 3)== 1.0);
		System.out.println("Its correct");
	}

	

}


