package com.nt.assignment1;



public class Q3SumOfUniqueElementArray {

	public static void main(String[] args) {
		System.out.println("--Unique element--");
		//int[] a= {1, 6, 4, 3, 2, 2, 3, 8, 1,6,4};
		int[] a= {1,1,3,2,2,3};
		for(int i=0;i<a.length-1;i++) {
			boolean isUnique=false;
			for(int j=0;j<i;j++){
			if(a[i]==a[j]) {
				isUnique=true;
				break;
			}//if
	       }//innerloop
			if(!isUnique) {
				System.out.println(a[i]);
				
			}
		}//outerloop
		
	}

}
