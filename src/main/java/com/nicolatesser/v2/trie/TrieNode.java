package com.nicolatesser.v2.trie;

public class TrieNode {
	
	private char value;

	private TrieNode[] children = new TrieNode[256];
	
	public TrieNode(char value){
		this.value=value;
	}
	
	public TrieNode(){
	}
	
	public char getValue() {
		return value;
	}



	public void setValue(char value) {
		this.value = value;
	}



	public TrieNode getChildAtInder (char c){
		return children[(int)c];
	}
	
	public void setChild(char c){
		TrieNode node = new TrieNode(c);
		children[(int) c] = node;
	}
	

}
