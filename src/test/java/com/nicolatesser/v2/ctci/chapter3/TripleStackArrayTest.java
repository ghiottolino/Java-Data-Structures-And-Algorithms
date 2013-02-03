package com.nicolatesser.v2.ctci.chapter3;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TripleStackArrayTest {

	private TripleStackArray sut = new TripleStackArray();
	
	@Test
	public void testPop_Stack0() {
		
		//prepare
		sut.push(0, "stack0 a");
		sut.push(0, "stack0 b");
		
		
		//execute
		Object pop = sut.pop(0);
		
		//verify
		Assert.assertEquals("stack0 b", pop);
	}

	@Test
	public void testPop_Stack1() {
		
		//prepare
		sut.push(1, "stack1 a");
		sut.push(1, "stack1 b");
		
		
		//execute
		Object pop = sut.pop(1);
		
		//verify
		Assert.assertEquals("stack1 b", pop);
	}
	
	@Test
	public void testPop_Stack2() {
		
		//prepare
		sut.push(2, "stack2 a");
		sut.push(2, "stack2 b");
		
		
		//execute
		Object pop = sut.pop(2);
		
		//verify
		Assert.assertEquals("stack2 b", pop);
	}


}
