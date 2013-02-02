package com.nicolatesser.v2.linkedlists;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ListTest {

	private List sut;
	
	@Before
	public void setUp() throws Exception {
		sut= new List();
	}

	@Test
	public void test() {
		Assert.assertTrue(sut.isEmpy());
		Assert.assertEquals(0, sut.size());
		sut.insertFirst("primo");
		Assert.assertEquals(1, sut.size());
		Assert.assertFalse(sut.isEmpy());
		sut.insertFirst("primissimo");
		Assert.assertEquals(2, sut.size());
		Assert.assertFalse(sut.isEmpy());
		sut.insertLast("ultimo");
		Assert.assertEquals(3, sut.size());

	
	}

}
