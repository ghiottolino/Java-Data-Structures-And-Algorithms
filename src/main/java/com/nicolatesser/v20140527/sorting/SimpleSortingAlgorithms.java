package com.nicolatesser.v20140527.sorting;





public class SimpleSortingAlgorithms {


	public static void swap(int[]array, int i, int j){
		int tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
	
	public static void insertionSort(int[]array){
		int i=1;
		while (i<array.length){
			int j=0;
			while (array[j]<array[i]&& j<i) j++;
			if (j<i){
				int tmp=array[i];
				int k=i;
				while (k>j){
					array[k]=array[k-1];
					k--;
				}
				array[j]=tmp;
			}
			i++;
		}
		
	}
	
	public static void quickSort(int[]array){
		quickSort(array,0,array.length-1);
	}
	
	public static void quickSort(int[]array, int a, int b){
		if (b<=a) return;
		int p=array[a];
		int i=a+1;
		int j=b;
		while(i<=j){
			while((i<=j)&&(array[i]<p))i++;
			while((i<=j)&&(array[j]>=p))j--;
			if (i<j)swap(array,i,j);
		}
		swap(array,a,j);
		quickSort(array,a,j-1);
		quickSort(array,j+1,b);
	}
	
	
	public static void mergeSort(int[]array){
		mergeSort(array,0,array.length-1);
	}
	
	
	private static void mergeSort(int[]array,int a,int b){
		if (b-a<=1) return;
		int m= (b+a)/2;
		mergeSort(array,a,m);
		mergeSort(array,m+1,b);
		int i=a;
		int j=m+1;
		int k=0;
		int[]merged=new int[b-a+1];
		while(i<=m&&j<=b){
			if(array[i]<=array[j]){
				merged[k]=array[i];
				i++;
			}
			else{
				merged[k]=array[j];
				j++;
			}
			k++;
		}
		while(i<=m){
			array[k]=array[i];
			i++;
			k++;
		}
		while(j<=b){
			array[k]=array[j];
			j++;
			k++;
		}
		//copy
		for (i=a;i<=b;i++){
			array[i]=merged[i-a];
		}
		return;
	}
	
	
	public static void heapSort(int[]array){
		int n=array.length;
		for (int i=n-1;i>=0;i--){
			heapify(array,i,n);
		}
		for (int i=0;i<n;i++){
			int t=array[0];
			array[0]=array[n-i-1];
			array[n-i-1]=t;
			heapify(array,0,n-i-1);
		}
	}
	
	private static void heapify(int[]array,int i, int n){
		int left=(i+1)*2-1;
		int right=(i+1)*2;
		if (right<n){
			if ((array[right]>=array[left])&&(array[right]>array[i])){
				swap(array,i,right);
				heapify(array, right, n);
				return;
			}
		}
		if (left<n){
			if(array[left]>=array[i]){
				swap(array,i,left);
				heapify(array,left,n);
				return;
			}
		}
		return;
	}
	
	
}
