package com.Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorImplTest {
	
	CalculatorImpl calc;
	@Before
	public void setUp() throws Exception {
		calc = new CalculatorImpl();
	}

	@Test
	public void testAdd() {
		int a=5,b=4;
		int result = 4+5;
		assertEquals(result,calc.add(a, b));
	}

	@Test( expected = ArithmeticException.class)
	public void testDivide() {
		
		assertEquals(4,calc.divide(8, 0));
	}

}
