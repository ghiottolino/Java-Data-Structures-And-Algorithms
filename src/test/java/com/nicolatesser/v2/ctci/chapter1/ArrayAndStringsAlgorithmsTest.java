package com.nicolatesser.v2.ctci.chapter1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ArrayAndStringsAlgorithmsTest {

	@Test
	public void testHasAllUniqueChars_True() {
		String s ="abcdefghi";
		boolean allUniqueChars = ArrayAndStringsAlgorithms.hasAllUniqueChars(s);
		Assert.assertTrue(allUniqueChars);
	}

	
	@Test
	public void testHasAllUniqueChars_False() {
		String s ="abcdefbghi";
		boolean allUniqueChars = ArrayAndStringsAlgorithms.hasAllUniqueChars(s);
		Assert.assertFalse(allUniqueChars);
	}
	
	
	


	
	@Test
	public void testHasAllUniqueCharsInPlace_False() {
		String s ="abcdefbghi";
		boolean allUniqueChars = ArrayAndStringsAlgorithms.hasAllUniqueCharsInPlace(s);
		Assert.assertFalse(allUniqueChars);
	}
	
	
	
	
	
}
