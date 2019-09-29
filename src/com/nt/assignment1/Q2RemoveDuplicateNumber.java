package com.nt.assignment1;

public class Q2RemoveDuplicateNumber {

	public static void main(String[] args) {
		System.out.println("----Remove Duplicate Number----");
		int[] a= {1,2,5,5,6,6,7,2,2};
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]){
                 a[j]=a[i];
                 j++;
			}//if
		}//forloop
		a[j]=a[a.length-1];
		for(int i=0;i<j;i++) {
			System.out.println(a[i]+"  ");
		}//forloop
	}
}
