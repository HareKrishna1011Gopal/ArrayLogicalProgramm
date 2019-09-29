package com.nt.assignment1;

public class Q9FindPairSum {

	static void findPairSum(int[] a,int ipNumber,int n) {
	System.out.println("Pair of Element whose sum is"+ipNumber+"are::");
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			int sum=0;
			 sum=a[i]+a[j];
			if(sum==ipNumber) {
				System.out.println(a[i]+"+"+a[j]+"="+ipNumber);
			}
		  }//innerloop
	   }//outerloop
	}
	public static void main(String[] args) {
		int[] a= {3,6,8,-8,10,8};
		int n=a.length;
		findPairSum(a,16,n);
	}
}
