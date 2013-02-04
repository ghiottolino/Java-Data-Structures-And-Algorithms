package com.nicolatesser.v2.trie;

public class Trie {
	
	private TrieNode root = new TrieNode();
	
	public void addString(String s){
		TrieNode currentNode = root;
		
		for (int i=0;i<s.length();i++){
			char c = s.charAt(i);
			TrieNode node = currentNode.getChildAtInder(c);
			if (node==null){
				currentNode.setChild(c);
			}
			currentNode = currentNode.getChildAtInder(c);
		}
	}
	
	public boolean matches(String s){
		
		boolean matches = true;
		TrieNode currentNode = root;
		
		for (int i=0;i<s.length();i++){
			char c = s.charAt(i);
			currentNode = currentNode.getChildAtInder(c);
			if (currentNode==null){
				matches=false;
				break;
			}
		
		}
		
		return matches;
	}
	

}
