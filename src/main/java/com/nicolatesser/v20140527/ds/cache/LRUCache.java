package com.nicolatesser.v20140527.ds.cache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.management.Attribute;



public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	int mSize;

	public LRUCache(int size) {
		super();
		mSize = size;
	}

	// public boolean removeOldest(){
	@Override
	public boolean removeEldestEntry(Map.Entry<K, V> entry) {
		if (size() > mSize)
			return true;
		return false;
	}

	public V put(K key, V value) {
		V existingValue = super.get(key);
		if (existingValue != null)
			remove(key);
		return super.put(key, value);
	}

	@Override
	public V get(Object key) {
		V existingValue = super.get(key);
		if (existingValue != null) {
			Set<K> keySet = keySet();
			K putKey=null;
			for (K k:keySet){
				if (k.equals(key)){
					putKey=k;
				
				}
			}
			put (putKey,existingValue);
			
		}
		return super.get(key);
	}
}
