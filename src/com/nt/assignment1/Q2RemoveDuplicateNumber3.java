package com.nt.assignment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q2RemoveDuplicateNumber3 {

	public static void main(String[] args) {
		int[] a= {1,2,5,5,6,6,7,2,8};
		Arrays.sort(a);
		 for(int i=0;i<a.length-1;i++) {
			 if(a[i]!=a[i+1]) {
				 System.out.println(a[i]);
			 }
		 }
	}

}
