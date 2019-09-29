package com.nt.assignment1;

public class Q1FindDuplicateNumber1 {

	public static void main(String[] args) {
		System.out.println("----Duplicate Number----");
		int[] a= {1,2,5,5,6,6,7,2};
		
		for(int i=0;i< a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.println("Duplicate number of array is::"+a[j]);
				}//if
			}//inner loop
		}//outer loop
	}//method
}//class
