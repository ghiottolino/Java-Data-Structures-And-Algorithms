package com.nicolatesser.datastructure_algorithms.sorting;

import java.util.Random;

public class SimpleSortingAlgorithms {

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}
		}
		return array;
	}

	/**
	 * If no substitution is made in one cycle then the array is returned.
	 * 
	 * @param array
	 * @return
	 */
	public static int[] bubbleSortOptimized(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean substitutionMade = false;
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					int t = array[i];
					array[i] = array[j];
					array[j] = t;
					substitutionMade = true;
				}

			}
			if (!substitutionMade) {
				System.out
						.println("bubbleSortOptimized: returned because no substitution has been made");
				return array;
			}
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array) {
	
		for (int i=1;i<array.length;i++)
		{
			
			int j=i-1;
			while ((j>=0)&&(array[i]<array[j]))
			{
				int t = array[i];
				array[i] = array[j];
				array[j] = t;
				i--;
				j--;
			}
			
		}
		
		return array;
	}
	
	
	
	
	
	
	
	
	
	
	
	
/*
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			while ((j >= 0) && (array[i] < array[j])) {
				int t = array[i];
				array[i] = array[j];
				array[j] = t;
				j--;
				i--;
			}
		}

		return array;
	}
	*/
	
	public static int[] selectionSort(int[] array) {
		for (int i=0;i<array.length-1;i++)
		{
			int min=Integer.MAX_VALUE;
			int min_index=i;
			for (int j=i+1;j<array.length;j++)
			{
				if (array[j]<min)
				{
					min =array[j];
					min_index=j;
				}	
			}
			if (min<array[i])
			{
				int t=array[i];
				array[i]=array[min_index];
				array[min_index]=t;
			}
		}
		
		return array;
	}
	
	

	

	
	
	public static int[] mergeSort(int[] array)
	{
		if (array.length==1) return array;
		
		int mid = (array.length) / 2;
		
		int[] low = new int[mid];
		int[] high = new int[array.length-mid];
		
		for (int i=0;i<array.length;i++)
		{
			if (i<mid)
			{
				low[i]=array[i];
			}
			else
			{
				high[i-mid]=array[i];
			}
		}
			
		
		low = mergeSort(low);
		high = mergeSort(high);
		
		int[]ordered = new int[array.length];
	
		int i=0;
		int j=0;
		
		while ((i<low.length)&&(j<high.length))
		{
			if (low[i]<=high[j])
			{
				ordered[i+j]=low[i];
				i++;
			}
			else
			{
				ordered[i+j]=high[j];
				j++;
			}
		}
	
		while (i<low.length)
		{
			ordered[i+j]=low[i];
			i++;
		}
		
		while (j<high.length)
		{
			ordered[i+j]=high[j];
			j++;
		}
		
		
		return ordered;
	}
	
	
	
	
	
	
	
	/**
	 * Implemented in place, with indexes
	 * 
	 * @param array
	 * @param a
	 * @param b
	 */
	/*private static void mergeSort(int[] array, int a, int b) {
		if (a>= b)
			return;

		int i = (b+a)/2;

		mergeSort(array, a, i);
		mergeSort(array, i+1, b);

		merge(a, i, b, array);
	}

	private static void merge(int a, int p, int b, int[] array) {

		// int[]array = new int[array1.length+array2.length];

		int i = 0;
		int j = 0;

		while ((i + a <= p) && (p+1+j <= b)) {
			if (array[a+i] <= array[p+1+j]) {
				array[i + j + a] = array[i + a];
				i++;
			} else {
				array[i + j + a] = array[p+1+j];
				j++;
			}
		}

		while (i + a <= p) {
			array[i + j + a] = array[a + i];
			i++;
		}

		while (j + 1 + p <= b) {
			array[i + j + a] = array[j + 1 + b];
			j++;
		}
		// return array;
	}
*/
	
	//TODO: fix me
	public static int[] quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
		return array;
	}
	
	public static void quickSort(int[] array, int a, int b)
	{
		//base
		if (a>=b) return;
		
		int pivot = array[b];
		int i=a;
		int j=b-1;
		
		while (i<=j)
		{
			while ((i<=j)&&(array[i]<=pivot))
			{
				i++;
			}
			while ((i<=j)&&(array[j]>=pivot))
			{
				j--;
			}
			
			if (i<j)
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
		
		array[b]=array[i];
		array[i]=pivot;
		
		
		
		//recursion
		quickSort(array,a,i-1);
		quickSort(array,i+1,b);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	public static int[] heapSort(int[] array) {
		// from sequence to heap (insertItem)

		for (int i = 0; i < array.length; i++) {
			int j = i;
			int k = i;

			while (j > 0) {
				j = (j - 1) / 2;
				if (array[k] > array[j]) {
					int t = array[k];
					array[k] = array[j];
					array[j] = t;
					k = j;
				} else
					break;

			}

		}

		// from heap to ordered sequence (removeMax)
		for (int i = 0; i < array.length; i++) {
			// move the head (max) at the end, k is last index of head
			int k = array.length - 1 - i;
			int t = array[0];
			array[0] = array[k];
			array[k] = t;

			int j = 0;

			// if at least the left children is still inside the heap
			if ((j * 2 + 1) < k) {

				//the value of the node to pop down
				int a = array[j];
				
				while ((j * 2 + 1) < k) {

					// the 2 children	
					int b = array[j * 2 + 1];
					// c may be not present, initialize to 0
					int c = Integer.MIN_VALUE;
					if ((j * 2 + 2) < k) {
						c = array[j * 2 + 2];
					}
					if ((a > b) && (a > c))
						break;
					else {
						if (b > c) {
							array[j] = b;
							array[j * 2 + 1] = a;
							j = j * 2 + 1;
						} else {
							array[j] = c;
							array[j * 2 + 2] = a;
							j = j * 2 + 2;
						}
					}

				}
			}
		}

		return array;
	}

	
	
	
	
	
	
	
	
	
	public static int[] randomizedQuickSort(int[] array) {
		randomizedQuickSort(array, 0, array.length-1);
		return array;
	}
	
	
	private static void randomizedQuickSort(int[] array, int a, int b) {
		
		if (a>=b) return;
		
		System.out.println("*******");
		
		Random random = new Random();
		int pivotIndex = random.nextInt(b-a)+a;
		int pivot = array[pivotIndex];
		
		System.out.println("select pivot"+pivot);
		
		//pivot at the end
		array[pivotIndex] =array[b];
		array[b] = pivot;
		
		int i=a;
		int j=b-1;
		
		while (i<=j)
		{
			while ((i<=j)&&(array[i]<=pivot)) i++;
			while ((i<=j)&&(array[j]>=pivot)) j--;

			if (i<j)
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			}		
		}

		
		array[b]=array[i];
		array[i]=pivot;
		
		randomizedQuickSort(array, a, i-1);
		randomizedQuickSort(array, i+1, b);
		
	
		return;
		
	}
	
	
	
	
	
	
	
	
	/*
	public static void randomizedQuickSort(int[] array, int a, int b)
	{
		//base
		if (a>=b) return;
		
		Random r = new Random();
		int random = r.nextInt(b-a);
		int pivotIndex = a + random;
		int pivot = array[pivotIndex];
		//substitute random with last
		array[pivotIndex]=array[b];
		array[b]=pivot;
		
		int i=a;
		int j=b-1;
		
		while (i<=j)
		{
			while ((i<=j)&&(array[i]<=pivot))
			{
				i++;
			}
			while ((i<=j)&&(array[j]>=pivot))
			{
				j--;
			}
			
			if (i<j)
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
		
		array[b]=array[i];
		array[i]=pivot;
		
		
		
		//recursion
		randomizedQuickSort(array,a,i-1);
		randomizedQuickSort(array,i+1,b);
		
		
	}
	*/
	
	public static int select(int[]array, int n)
	{
		return select(array,n,0,array.length-1);
	}
	

	private static int select(int[]array,int n, int a, int b)
	{
		if (a==b) return array[a];
		
		System.out.println("select "+n+"th element between "+a+","+b);
		Random r = new Random();
		int random = r.nextInt(b-a);
		int pivotIndex = a + random;
		int pivot = array[pivotIndex];	
		System.out.println("selected pivot"+pivot);
		
		//swap
		array[pivotIndex]=array[b];
		array[b]=pivot;
		
		int i=a;
		int j=b-1;
		
		while((i<=j))
		{
			while((i<=j)&&(array[i]<pivot))i++;
			while((i<=j)&&(array[j]>pivot))j--;
		
			if (i<j)
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
		//exchange i and pivot
		System.out.println("i is"+i);
		array[b]=array[i];
		array[i]=pivot;
				
		if (n==i) return pivot;
		else if (n<i) return select(array, n, a,i-1);
		else return select(array, n, i+1,b);
			
		
	}
	

}
