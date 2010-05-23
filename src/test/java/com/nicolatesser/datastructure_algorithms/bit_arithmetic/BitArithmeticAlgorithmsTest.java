package com.nicolatesser.datastructure_algorithms.bit_arithmetic;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class BitArithmeticAlgorithmsTest {

	@Test
	public void testSum() {
		int a = 3;
		int b = 5;
		
		int sum = BitArithmeticAlgorithms.sum(a, b);
		
		Assert.assertEquals(a+b, sum);
	}

}
