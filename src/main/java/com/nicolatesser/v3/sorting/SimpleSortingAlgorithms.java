package com.nicolatesser.v3.sorting;

import java.util.ArrayList;



public class SimpleSortingAlgorithms {

	public static void selectionSort(int[] array) {
		for (int i=0;i<array.length-1;i++){
			int min=array[i];
			int minIndex=i;
			for (int j=i+1;j<array.length;j++){
				if (array[j]<min){
					min=array[j];
					minIndex=j;
				}
			}
			swap(array,i,minIndex);
		}
	}
	
	public static void swap(int[]array, int i, int j){
		int t=array[i];
		array[i]=array[j];
		array[j]=t;
	}
	
	public static void insertionSort(int[]array){
		for (int i=1;i<array.length;i++){
			int value=array[i];
			int j=0;
			while (j<i && array[j]<=array[i])j++;
			for (int k=i;k>j;k--) array[k]=array[k-1];
			array[j]=value;
		}
	}
	
	public static void quickSort(int[]array){
		quickSort(array, 0, array.length-1);
	}
	
	public static void quickSort(int[]array, int a, int b){
		if (a>=b) return;
		int p=array[a];
		int l=a+1;
		int r=b;
		while (l<=r){
			while ((l<=r)&&(array[l]<=p))l++;
			while ((r>=l)&&(array[r]>=p))r--;
			if (l<r){
				swap(array,l,r);
			}
		}
		swap(array,a,r);
		quickSort(array,a,r-1);
		quickSort(array,l,b);
	}
	
	public static void mergeSort(int[]array){
		mergeSort(array, 0, array.length-1);
	}
	
	public static void mergeSort(int[]array, int i, int j){
		if (i>=j) return;
		int m=(i+j)/2;//int m=i+j/2;
		mergeSort(array,i,m);
		mergeSort(array,m+1,j);
		merge(array,i,m,j);
	}
	
	public static void merge(int[]array, int i, int m, int j){
		int[]helper = new int[array.length];
		for (int k=i;k<=j;k++){
			helper[k]=array[k];
		}
		int p1=i;
		int p2=m+1;
		int k=i;
		while (p1<=m && p2<=j){
			if (helper[p1]<=helper[p2]){
				array[k]=helper[p1];
				p1++;
			}
			else{
				array[k]=helper[p2];
				p2++;
			}
			k++;
		}
		while (p1<=m){
			array[k]=helper[p1];
			k++;
			p1++;
		}
	}
	
	public static void radixSort(int[]array, int maxDigits){
		int exp=1;
		for (int i=0;i<maxDigits;i++){
			ArrayList<Integer> bucketList[]=new ArrayList[10];
			for (int j=0;j<10;j++) bucketList[j]=new ArrayList<Integer>();
			for (int j=0;j<10;j++){
				int number=(array[j]/exp)%10;
				bucketList[number].add(array[j]);
			}
			exp=exp*10;
			int k=0;
			for (int j=0;j<10;j++){
				for (int num:bucketList[j]){
					array[k]=num;
					k++;
				}
			}
		}
	}
	
	public static void heapSort(int[]array){
		for (int i=(array.length/2)-1;i>=0;i--){
			balanceHeap(array,i, array.length);
		}
		int n=array.length;
		for (int i=1;i<=n;i++){
			swap(array,0,n-i);
			balanceHeap(array,0,n-i);
		}
	}
	
	public static void balanceHeap(int[]array, int i, int n){

		int left=(i+1)*2-1;
		int right=(i+1)*2;
		if (left>=n)return;
		int maxIndex=i;
		if(array[i]<array[left])maxIndex=left;
		if (right<n && array[maxIndex]<array[right])maxIndex=right;
		if (maxIndex==i)return;
		else if (maxIndex==left){
			swap(array,i,left);
			balanceHeap(array,left,n);
		}
		else if (maxIndex==right){
			swap(array,i,right);
			balanceHeap(array,right,n);
		}
	}
}
