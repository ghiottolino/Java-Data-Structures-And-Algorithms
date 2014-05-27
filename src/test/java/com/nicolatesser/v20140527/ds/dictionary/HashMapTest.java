package com.nicolatesser.v20140527.ds.dictionary;

import org.junit.Test;

import com.nicolatesser.v1.datastructure_algorithms.datastructures.dictionary.ArrayHashTable;

import junit.framework.Assert;


public class HashMapTest {

	@Test
	public void testHashTable()
	{
		
		
		HashMap  hashTable = new HashMap(10);
		hashTable.put("test", "test");
		hashTable.put("test2", "test2");
		hashTable.put("test3", "test3");
		
		String get1 = (String) hashTable.get("test");
		String get2 = (String) hashTable.get("test2");
		String get3 = (String) hashTable.get("test3");
		
	
		
		
		
		Assert.assertEquals("test", get1);
		Assert.assertEquals("test2", get2);
		Assert.assertEquals("test3", get3);
		
		
		hashTable.put("test", "test3");
		get1 = (String) hashTable.get("test");
		Assert.assertEquals("test3", get1);

		
		
	}
	
	
	
}
