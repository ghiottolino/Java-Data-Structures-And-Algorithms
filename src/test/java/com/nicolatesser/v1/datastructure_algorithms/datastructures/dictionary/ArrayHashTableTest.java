package com.nicolatesser.v1.datastructure_algorithms.datastructures.dictionary;

import org.junit.Test;

import com.nicolatesser.v1.datastructure_algorithms.datastructures.dictionary.ArrayHashTable;

import junit.framework.Assert;


public class ArrayHashTableTest {

	@Test
	public void testHashTable()
	{
		
		
		ArrayHashTable hashTable = new ArrayHashTable();
		hashTable.put("test", "test");
		hashTable.put("test2", "test2");
		hashTable.put("test3", "test3");
		
		String get1 = hashTable.get("test");
		String get2 = hashTable.get("test2");
		String get3 = hashTable.get("test3");
		
		Assert.assertEquals("test", get1);
		Assert.assertEquals("test2", get2);
		Assert.assertEquals("test3", get3);
		
		
		
	}
	
	
	
}
