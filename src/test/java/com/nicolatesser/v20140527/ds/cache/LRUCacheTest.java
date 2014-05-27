package com.nicolatesser.v20140527.ds.cache;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class LRUCacheTest {

	@Test
	public void testPutKV_DeleteLast() {
		
		LRUCache<String, String> cache = new LRUCache<String, String>(3);
		
		cache.put("key1", "value1");
		cache.put("key2", "value2");
		cache.put("key3", "value3");
		cache.put("key4", "value4");
		
		Assert.assertEquals("value4", cache.get("key4"));
		Assert.assertEquals("value3", cache.get("key3"));
		Assert.assertEquals("value2", cache.get("key2"));
		Assert.assertNull(cache.get("key1"));

		
	}
	
	@Test
	public void testPutKV_UpdateChangeOrder() {
		
		LRUCache<String, String> cache = new LRUCache<String, String>(3);
		
		cache.put("key1", "value1");
		cache.put("key2", "value2");
		cache.put("key3", "value3");
		cache.put("key4", "value4");
		cache.put("key1", "value1");
		
		Assert.assertEquals("value3", cache.get("key3"));
		Assert.assertEquals("value4", cache.get("key4"));
		Assert.assertEquals("value1", cache.get("key1"));

		Assert.assertNull(cache.get("key2"));

		
	}

	@Test
	public void testPutKV_GetChangeOrder() {
		
		LRUCache<String, String> cache = new LRUCache<String, String>(3);
		
		cache.put("key1", "value1");
		cache.put("key2", "value2");
		cache.put("key3", "value3");
		String string = cache.get("key1");
		cache.put("key4", "value4");

		
		Assert.assertEquals("value1", cache.get("key1"));
		Assert.assertEquals("value3", cache.get("key3"));
		Assert.assertEquals("value4", cache.get("key4"));
		Assert.assertNull(cache.get("key2"));

		
	}
}
