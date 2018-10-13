package com.cg.test;

import org.junit.Test;

import com.cg.bean.Calculator;

import junit.framework.Assert;

public class TestCalculator {

	@Test
	public void test_add()
	{
		Calculator calc=new Calculator();
		int res=calc.add(3,4);
		Assert.assertEquals(7, res);
	}
	
	@Test
	public void test_subtract()
	{
		Calculator calc=new Calculator();
		int res=calc.subtract(6,2);
		Assert.assertEquals(4, res);
	}
	
	@Test
	public void test_multiply()
	{
		Calculator calc=new Calculator();
		int res=calc.multiply(2,4);
		Assert.assertEquals(8, res);
	}
	
	@Test
	public void test_square()
	{
		Calculator calc=new Calculator();
		int res=calc.calcSquare(6);
		Assert.assertEquals(36, res);
	}
}
