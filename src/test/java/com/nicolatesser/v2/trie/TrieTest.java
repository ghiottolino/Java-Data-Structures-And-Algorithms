package com.nicolatesser.v2.trie;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TrieTest {

	private Trie sut = new Trie();
	
	@Test
	public void testAddString() {

		sut.addString("many");
		sut.addString("man");
		sut.addString("any");
		sut.addString("anyone");

		//Verify
		boolean matches = sut.matches("man");
		Assert.assertTrue(matches);
		matches = sut.matches("manyla");
		Assert.assertFalse(matches);

		
	}

}
