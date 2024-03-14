package com.test;

import org.junit.Assert;
import org.junit.Test;

public class TestCalcOperations {

	@Test
	public void testAdd() {
		int a = 10;
		int b = 20;
		int actSum = a + b;
		Assert.assertEquals(30, actSum);
	}

	@Test
	public void testMult() {
		int a = 10;
		int b = 20;
		int actProd = a * b;
		Assert.assertEquals(200, actProd);
	}

}
