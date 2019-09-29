package com.nt.assignment1;

public class Q10SmallestPairSum {

	public static void main(String[] args) {
		System.out.println("---SmallestPairSum----");

		int[] a= {1,2,3,7,3};
		int n=a.length;
		int min=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
				
		for(int j=0;j<n;j++) {
			if(a[j]<min){
				secondmin=min;
				min=a[j];
			}
			else if((a[j]<secondmin)&&a[j]!=min){
				secondmin=a[j];
			}
		}//for
		System.out.println("SumSmallestElement is::"+(secondmin+min));
	}

}
