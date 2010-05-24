package com.nicolatesser.datastructure_algorithms.number_theroretic;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberTheoreticAlgorithmsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

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
	public void testIsPseudoPrime_Prime() {
		
		int a = 53;
		
		boolean prime = NumberTheoreticAlgorithms.isPseudoPrime(a);
		
		Assert.assertTrue(prime);
	}
	
	@Test
	public void testIsPseudoPrime_NonPrime() {
		
		int a = 2597;
		
		boolean prime = NumberTheoreticAlgorithms.isPseudoPrime(a);
		
		Assert.assertFalse(prime);
	}

}
