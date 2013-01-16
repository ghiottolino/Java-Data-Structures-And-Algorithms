package com.nicolatesser.v2.sorting;

public class SimpleSortingAlgorithms {

	public static int[] bubbleSort(int[] array) {
		
		for (int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++){
				
				if (array[i]>array[j])
				{
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
		for (int i=0;i<array.length-1;i++)
		{
			boolean substitution=false;
			for(int j=i+1;j<array.length;j++){
				
				if (array[i]>array[j])
				{
					int t = array[i];
					array[i] = array[j];
					array[j] = t;
					substitution=true;
				}
			}
			if (!substitution)
			{
				break;
			}
		}
		return array;
	}

	public static int[] insertionSort(int[] array) {
		int[]orderedArray = new int[array.length];
		
		orderedArray[0]=array[0];
		
		for (int i=1;i<array.length;i++)
		{
			int item = array[i];
			for (int j=0;j<i;j++)
			{
				if (item<orderedArray[j])
				{
					int t = item;
					item = orderedArray[j];
					orderedArray[j] = t;
				}
			}
			orderedArray[i]=item;
			
		}
		return orderedArray;
	}

	public static int[] selectionSort(int[] array) {
		for (int i=0;i<array.length-1;i++)
		{
			int minIndex = i;
			for (int j=i+1;j<array.length;j++)
			{
				if (array[j]<array[minIndex])
				{
					minIndex=j;
				}
			}
			if (minIndex!=i)
			{
				int t=array[i];
				array[i]=array[minIndex];
				array[minIndex]=t;
			}
		
		}
		return array;
	}

	public static int[] mergeSort(int[] array) {
		if ((array.length==0)||(array.length==1)) return array;
		else
		{
			int n= array.length/2;
			
			int array1[] = new int[n];
			int array2[] = new int[array.length-n];
			for (int i=0;i<array.length;i++)
			{
				if (i<n)
				{
					array1[i]=array[i];
				}
				else
				{
					array2[i-n]=array[i];
				}
			}
			
			int[] sortedArray1= mergeSort(array1);
			int[] sortedArray2= mergeSort(array2);
			
			int[] sortedArray = new int[array.length];
			
			int i=0;
			int j=0;
			
			while ((i<sortedArray1.length)&&(j<sortedArray2.length))
			{
				if (sortedArray1[i]<=sortedArray2[j])
				{
					sortedArray[i+j]=sortedArray1[i];
					i++;
				}
				else
				{
					sortedArray[i+j]=sortedArray2[j];
					j++;
				}
			}
		
			while (i<sortedArray1.length)
			{
				sortedArray[i+j]=sortedArray1[i];
				i++;
			}
			while (j<sortedArray2.length)
			{
				sortedArray[i+j]=sortedArray2[j];
				j++;
			}
			
			
			return sortedArray;
		}
	}

	public static int[] quickSort(int[] array) {
		return quickSort(array,0,array.length-1);
	}
	
	public static int[] quickSort(int[] array,int a, int b) {
		if (a>=b) return array;
		else
		{
			int pivot = array[a];
			int i = a+1;
			int j = b;
			while (j>i)
			{
				while((array[i]<pivot)&&(i<b))i++;
				while((array[j]>pivot)&&(j>a+1))j--;
				if (i<j)
				{
					int t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
			
			quickSort(array,a+1,j);
			quickSort(array,j+1,b);
			
			//put L E G 
			if (array[j]<pivot)
			{
				for(int k=a+1;k<=j;k++)
				{
					array[k-1] = array[k];
				}
				array[j]=pivot;
			}

			
			
			return array;
		}
	}
	

	public static int[] heapSort(int[] array) {
		// build heap
		for (int i=1;i<array.length;i++)
		{
			int currentIndex = i;
			int parentIndex = (i-1) / 2;
			while((array[parentIndex]<array[currentIndex]))
			{
				int  t=array[parentIndex];
				array[parentIndex] = array[currentIndex];
				array[currentIndex] = t;
				
				currentIndex = parentIndex;
				parentIndex = (parentIndex-1) / 2;
			}
			
			
		}
		
		// sort
		
		for (int i=0;i<array.length-1;i++)
		{
			//swap the top of the heap with the virtual end of the head (heap is becoming smaller)
			int t = array[0];
			array[0] = array[array.length-1-i];
			array[array.length-1-i] = t;
			
			
			int currentIndex=0;
			int leftChildrenIndex=currentIndex*2+1;
			int rightChildrenIndex=leftChildrenIndex+1;
			
			while(((leftChildrenIndex<array.length-1-i)&&(array[currentIndex]<array[leftChildrenIndex]))||((rightChildrenIndex<array.length-1-i)&&(array[currentIndex]<array[rightChildrenIndex])))
			{
				int swapIndex=leftChildrenIndex;
				//if right bigger than left swap with right 
				if ((array[rightChildrenIndex]>array[leftChildrenIndex])&&(rightChildrenIndex<array.length-1-i))
				{
					swapIndex = rightChildrenIndex;
				}

				//swap current with one children
				t = array[swapIndex];
				array[swapIndex] = array[currentIndex];
				array[currentIndex] = t;
				
				currentIndex = swapIndex;
				leftChildrenIndex=currentIndex*2+1;
				rightChildrenIndex=leftChildrenIndex+1;
			}
			
			
		}
		
		
		
		
		// TODO Auto-generated method stub
		return array;
	}

	public static int[] randomizedQuickSort(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}

}
