package com.nt.assignment1;

import java.util.HashSet;
import java.util.Set;

public class Q2RemoveDuplicateNumber2 {

	public static void main(String[] args) {
		System.out.println("----Remove Duplicate Number set----");
		int[] a= {1,2,5,5,6,6,7,2,2,2};
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length-1;i++) {
			set.add(a[i]);
		}
		
		for(int s:set) {
			System.out.println(s);
		}
	}

}
