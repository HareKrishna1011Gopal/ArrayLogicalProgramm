package com.nt.assignment2;

public class Q6SuperElement_atLeast2 {

	public static void main(String[] args) {
		int[] a= {1, 5, 3, 6};
		int n=a.length;
		int temp=0;
		
		for(int i=0;i<n;i++) {
			int count=0;
			  for(int j=0;j<n;j++) {
				  if(a[j]>a[i]) {
					  count++;
					  temp=a[i];
				  }//if
			  }//innerfor
			  if(count>=2) {
				  System.out.println(temp);
			  }
		}//outerloop
	}

}
