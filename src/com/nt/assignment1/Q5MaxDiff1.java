package com.nt.assignment1;

public class Q5MaxDiff1 {

	public static void main(String[] args) {
    System.out.println("--MAx diff between 2 number--");
    // int[] a= {2,5,1,7,3,9,5};
     int[] a= {9,2,12,5,4,7,3,19,5};
     int diff=Integer.MIN_VALUE;
     int n=a.length;
     int max=a[n-1];
     for(int i=n-2;i>=0;i--) {
    	 if(a[i]>max) {
    		 max=a[i];
    	 }
    	 else {
    		 diff=Integer.max(diff,max-a[i]);
    	 }
     }//for
     System.out.println(diff);

	}//method

}
