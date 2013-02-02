package com.nicolatesser.v2.linkedlists;

public class List {
	
	// TODO : a better idea would be to have 2 "fake" head and tail node.
	
	private Node head = null;
	
	private Node tail = null;
	
	private int size=0;
	
	public List()
	{
		
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpy()
	{
		return size()==0;
	}
	
	public void insertFirst(Object o){
		Node next=null;
		if (head!=null)
		{
			next=head.getNext();
		}
		
		Node node = new Node(o,null,next);
		this.head=node;
		size++;
		if (tail==null)
		{
			this.tail=node;
		}
	
	}
	
	public void insertLast(Object o){
		Node prev=null;
		if (tail!=null)
		{
			prev=tail.getPrev();
		}
		
		Node node = new Node(o,prev,null);
		this.tail=node;
		size++;
		if (head==null)
		{
			this.head=node;
		}
	}
	

}
