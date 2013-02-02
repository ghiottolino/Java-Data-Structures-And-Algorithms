package com.nicolatesser.v2.math;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class NumberTheoreticAlgorithmsTest {

	@Test
	public void testIsPrime_Prime() {
		
		int a = 3041;
		
		boolean prime = NumberTheoreticAlgorithms.isPrime(a);
		
		Assert.assertTrue(prime);
	}
	
	@Test
	public void testIsPrime_NonPrime() {
		
		int a = 2597;
		
		boolean prime = NumberTheoreticAlgorithms.isPrime(a);
		
		Assert.assertFalse(prime);
	}

	
	@Test
	public void testIsPrimeSieveOfErastoshenes_Prime() {
		
		int a = 3041;
		//int a = 13;
		
		boolean prime = NumberTheoreticAlgorithms.isPrimeSieveOfErastoshenes(a);
		
		Assert.assertTrue(prime);
	}
	
	@Test
	public void testIsPrimeSieveOfErastoshenes_NonPrime() {
		
		int a = 2597;
		
		boolean prime = NumberTheoreticAlgorithms.isPrimeSieveOfErastoshenes(a);
		
		Assert.assertFalse(prime);
	}
	
}
