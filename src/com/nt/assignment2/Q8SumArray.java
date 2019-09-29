package com.nt.assignment2;

import java.util.Arrays;

public class Q8SumArray {

	public static void main(String[] args) {
		int a[]= {4,5,6};
		int n=a.length;
		int a1[]=new int[n];
		int ele1=a[0];
		int temp=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				ele1=a[j];
				sum=sum+ele1;
			}
			temp=sum-a[i];
			a1[i]=temp;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a1));
	}

}
