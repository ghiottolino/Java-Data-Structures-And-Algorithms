package com.nicolatesser.v20140527.ds.dictionary;

import java.util.LinkedList;

public class HashMap {
	
	LinkedList<KeyValue>[]map;
	public HashMap(int n){
		map = new LinkedList[n];
	}
	
	class KeyValue{
		Object key;
		Object value;
		public KeyValue(Object key, Object value){
			this.key=key;
			this.value=value;
		}
	}
	
	public Object get(Object key){
		KeyValue kv =getKv(key);
		if (kv!=null) return kv.value;
		else return null;
	}
	
	private KeyValue getKv(Object key){
		int i=getIndexByKey(key);
		LinkedList<KeyValue> list = map[i];
		if (list==null)return null;
		for (KeyValue kv:list){
			if (kv.key.equals(key))return kv;
		}
		return null;
	}
	
	private int getIndexByKey(Object key){
		int hashValue=key.hashCode();
		int i = hashValue%map.length;
		return i;
	}
	
	public void put (Object key, Object value){
		KeyValue kv=getKv(key);
		if (kv!=null){
			kv.value=value;
			return;
		}
		int i=getIndexByKey(key);
		LinkedList<KeyValue>list=map[i];
		if (list==null){
			list=new LinkedList<HashMap.KeyValue>();
		}
		list.add(new KeyValue(key, value));
		map[i]=list;
	}

}
