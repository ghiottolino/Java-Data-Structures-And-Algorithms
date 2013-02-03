package com.nicolatesser.v2.ctci.chapter2;

import com.nicolatesser.v2.linkedlists.Node;

public class LinkedListsAlgorithms {
	
	
	public static Node findKFromLast(Node head, int k){
		
		Node p1 = head;
		Node p2 = head;
		
		int i=0;
		
		while (p1!=null)
		{
			p1=p1.getNext();
			if (i<k)
			{
				i++;
				if(p1==null) return null;
			}
			else{
				p2=p2.getNext();
				if(p1==null) return p2;
			}
		}
		
		return null;
	}

}
