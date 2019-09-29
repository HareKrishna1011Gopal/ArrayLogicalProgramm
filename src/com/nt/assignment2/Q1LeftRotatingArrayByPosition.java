package com.nt.assignment2;

import java.util.Arrays;

public class Q1LeftRotatingArrayByPosition {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int n=a.length;
		int d=2;
		leftRotate(a,d,n);
		printArray(a,n);
	}

	public static void printArray(int[] a, int n) {
		for(int i=0;i<n;i++)
			System.out.println(Arrays.toString(a));
	}

	public static void leftRotate(int[] a, int d, int n) {
	    for(int i=0;i<d;i++)
	      leftRotatebyOne(a,n);
	}

	public static void leftRotatebyOne(int[] a, int n) {
		int i,temp;
		temp=a[0];
		for(i=0;i<n-1;i++)
	        a[i]=a[i+1];
	        a[i]=temp;	
	}
	
	
}
