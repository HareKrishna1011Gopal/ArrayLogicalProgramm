package com.nt.assignment1;

import java.util.Arrays;

public class Q6MinAndMaxElement {

	public static void main(String[] args) {
		int[] a= {1,2,5,5,6,6,7,2};
		Arrays.sort(a);
		int n=a.length;
		System.out.println("Min::"+a[0]);
		System.out.println("Max::"+a[n-1]);
	}

}
