package com.nt.assignment1;

public class Q7SecondMinAndMax {

	public static void main(String[] args) {
	    int[] a= {1,2,5,9,6,4,7,2};
	    int max=a[0];
	    int secondmax=a[0];
	    int min=a[0];
	    int secondmin=a[0];
	   
	    
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]>max) {
	    		secondmax=max;
	    		max=a[i];
	    	}
	    	else if(a[i]>secondmax){
	    		secondmax=a[i];
	    	}
	    }//for
	    
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]<min) {
	    		secondmin=min;
	    		min=a[i];
	    	}
	    	else if(a[i]<secondmin){
	    		secondmin=a[i];
	    	}
	    }//for
	    System.out.println("Second Minimum element is::"+secondmin);
	    System.out.println("Second Maximum element is::"+secondmax);
	}//method
}//class
