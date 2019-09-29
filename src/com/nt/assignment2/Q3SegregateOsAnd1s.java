package com.nt.assignment2;

import java.util.Arrays;

public class Q3SegregateOsAnd1s {

	public static void main(String[] args) {
		int[] a= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int n=a.length;
		segregate(a,n);
		print(a,n);
	}

	public static void print(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(a));
		}
	}

	public static void segregate(int[] a, int n) {
	   int count=0;
		
		for(int i=0;i<n-1;i++) {
			if(a[i]==0)
				count++;
		}
		System.out.println("0::"+count);
		for(int i=0;i<count;i++)
			a[i]=0;
		for(int i=count;i<n;i++)
			a[i]=1;
	}

}
