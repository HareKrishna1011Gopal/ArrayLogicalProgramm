package com.nt.assignment1;

import java.util.Arrays;

public class Q3SumOfUniqueElementArray2 {

	public static void main(String[] args) {
		System.out.println("--Sum of Unique element--");
		int[] a= {1, 6, 4, 3, 2, 2, 3, 8, 1,6,4};
		//int[] a= {1,1,3,2,2,3};
	     Arrays.sort(a);
	     System.out.println(Arrays.toString(a));
	     int sum=a[0];
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]!=a[i+1]) {
				sum=sum+a[i+1];
			}//if	
		}//outerloop
		System.out.println(sum);	
	}

}
