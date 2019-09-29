package com.nt.assignment2;

import java.util.Arrays;

public class Q7SortedArray_1stMax_2ndMin {

	public static void main(String[] args) {
		int a[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int n=a.length;
		int a1[]=new int[n];
		int sm=0,la=n-1;
		boolean flag=true;
		for(int i=0;i<n;i++) {
			if(flag==true) {
				a1[i]=a[la];
				la--;
			}
			else {
			a1[i]=a[sm];
			sm++;
			}//else
			flag=!flag;
	   }//for
		System.out.println(Arrays.toString(a1));
	}

}
