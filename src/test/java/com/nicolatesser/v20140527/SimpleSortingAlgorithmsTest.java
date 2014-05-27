package com.nicolatesser.v20140527;


import java.util.Arrays;

import junit.framework.TestCase;

import com.nicolatesser.v20140527.sorting.SimpleSortingAlgorithms;

public class SimpleSortingAlgorithmsTest  extends TestCase {

	private int[] array;

	protected void setUp() throws Exception {
		super.setUp();
		this.array = new int[] { 7, 8, 5, 2, 3, 1, 4, 0, 9, 6 };
		//this.array = new int[] { 2,1,3,4,5,6,7,8,9 };
		
	}

	public void assertArrayIsOrdered(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1])
				fail("the element at position " + (i)
						+ " is bigger than the element at position " + (i + 1)
						+ ". (" + array[i] + " > " + array[i + 1] + ").");
		}
	}
	
	public void printArray(int[]array)
	{
		for (int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

	
	

	public final void testInsertionSort() {
		int[] orderedArray=Arrays.copyOf(array, array.length);		
		SimpleSortingAlgorithms.insertionSort(orderedArray);
		//printArray(orderedArray);
		assertArrayIsOrdered(orderedArray);
	}


	public final void testMergeSort() {
		int[] orderedArray=Arrays.copyOf(array, array.length);		
		SimpleSortingAlgorithms.mergeSort(orderedArray);
		assertArrayIsOrdered(orderedArray);
	}

	public final void testQuickSort() {
		int[] orderedArray=Arrays.copyOf(array, array.length);		
		SimpleSortingAlgorithms.quickSort(orderedArray);
		
		printArray(orderedArray);
		
		assertArrayIsOrdered(orderedArray);

	}

	public final void testHeapSort() {
		int[] orderedArray=Arrays.copyOf(array, array.length);		
		SimpleSortingAlgorithms.heapSort(orderedArray);
		printArray(orderedArray);
		assertArrayIsOrdered(orderedArray);

	}

}
