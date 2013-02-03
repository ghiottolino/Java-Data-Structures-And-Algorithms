package com.nicolatesser.v2.ctci.chapter3;

public class TripleStackArray {

	int n=10;
	private Object[] array = new Object[n];
	private int delta = array.length/3;
	private int[] tops = new int[3];
	
	public TripleStackArray(){
		tops[0]=0;
		tops[1]=delta;
		tops[2]=delta*2;
	}
	
	public Object pop (int index){
		Object el = array[tops[index]];
		if (el!=null){
			int nIndex=tops[index]--;
			if (n>=index*delta){
				tops[index]=nIndex;
			}
		}
		return el;
	}
	
	public void push(int index, Object o)
	{
		if (o==null) return;
		int nIndex=tops[index]++;
		if (nIndex<(index+1)*delta){
			array[nIndex]=o;
			tops[index]=nIndex;
		}
	
	}
	
	
}




/**
 * ERRORS:
 * 
 * 1) Putting round brackets after the class name
 * 
 */