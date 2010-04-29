package com.nicolatesser.sorting;

public class SimpleSortingAlgorithms {
	
	public static int[] bubbleSort(int [] array)
	{
		for (int i=0;i<array.length-1;i++)
		{
			for (int j=i+1;j<array.length;j++)
			{
				if (array[i]>array[j])
				{
					int t = array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
		}	
		return array;
	}
	
	
	/**
	 * If no substitution is made in one cycle then the array is returned.
	 * @param array
	 * @return
	 */
	public static int[] bubbleSortOptimized(int [] array)
	{
		for (int i=0;i<array.length-1;i++)
		{
			boolean substitutionMade = false;
			for (int j=i+1;j<array.length;j++)
			{
				
				if (array[i]>array[j])
				{
					int t = array[i];
					array[i]=array[j];
					array[j]=t;
					substitutionMade=true;
				}
				
			}
			if (!substitutionMade)
			{
				System.out.println("bubbleSortOptimized: returned because no substitution has been made");
				return array;
			}
		}	
		return array;
	}
	
	
	public static int[] insertionSort(int [] array)
	{
		
		return array;
	}
	
	public static int[] mergeSort(int [] array)
	{
		
		return array;
	}
	
	public static int[] quickSort(int [] array)
	{
		
		return array;
	}
	
	public static int[] heapSort(int [] array)
	{
		
		return array;
	}
	
	public static int[] randomizedQuickSort(int [] array)
	{
		
		return array;
	}
	
	

}
