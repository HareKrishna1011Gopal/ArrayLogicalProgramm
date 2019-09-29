package com.nt.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q1FindDuplicateNumber3_best {

	public static void main(String[] args) {
		System.out.println("----Duplicate Number HAstTable----");
		int[] a= {1,2,5,5,6,6,7,2,5,6};
		 Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		 
		 for(int no:a) {
			 Integer count=map.get(no);
			 if(count==null) {
				 map.put(no,1);
			 }
			 else {
				 map.put(no,++count);
			 }//else
			}//for
		 
		 //Print duplicate number in array
		 Set<Map.Entry<Integer,Integer>> set=map.entrySet();
		 for(Map.Entry<Integer,Integer>m:set) {
			 if(m.getValue()>1) {
				 System.out.println(m.getKey());
			 }//if
		 }//forloop
		 
	}//method
}//class
