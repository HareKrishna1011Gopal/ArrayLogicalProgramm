package com.nt.assignment1;

import java.util.HashSet;
import java.util.Set;

public class Q1FindDuplicateNumber2_best {

	public static void main(String[] args) {
		System.out.println("----Duplicate Number Set In----");
		int[] a= {1,2,5,5,6,6,7,2,5};
		  Set<Integer> set=new HashSet<>();
		  
		  for(int no:a) {
			  if(set.add(no)==false) {
				  System.out.println("Duplicate number of array is::"+no);
			  }//if
		  }//forloop
	}//method
}//class
