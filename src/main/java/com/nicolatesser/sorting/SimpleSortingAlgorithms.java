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
		for (int i=1;i<array.length;i++)
		{
			int j=i-1;
			while ((j>=0)&&(array[i]<array[j]))
			{
				int t=array[i];
				array[i]=array[j];
				array[j]=t;
				j--;
				i--;
			}
		}
		
		return array;
	}
	
	public static int[] mergeSort(int [] array)
	{
		return mergeSort(array,0,array.length);
	}
	
	private static int[] mergeSort(int [] array, int a, int b)
	{
		if (b-a==1) return new int[]{array[a]};
		
		int i = b-((b-a)/2);
		
		int[]array1 = mergeSort(array, a,i);
		int[]array2 = mergeSort(array, i,b);
		
		return merge(array1,array2);
	}
	
	private static int[] merge(int[] array1, int[] array2)
	{
		
		int[]array = new int[array1.length+array2.length];
		
		int i=0;
		int j=0;
		
		while((i<array1.length)&&(j<array2.length))
		{
			if (array1[i]<=array2[j])
			{
				array[i+j]=array1[i];
				i++;
			}
			else{
				array[i+j]=array2[j];
				j++;
			}
		}
		
		while(i<array1.length)
		{
			array[i+j]=array1[i];
			i++;
		}

		while(j<array2.length)
		{
			array[i+j]=array2[j];
			j++;
		}
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
