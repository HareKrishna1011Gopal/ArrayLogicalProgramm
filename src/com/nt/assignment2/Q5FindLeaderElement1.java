package com.nt.assignment2;

public class Q5FindLeaderElement1 {

	public static void main(String[] args) {
	  int[] a= {1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
	  int n=a.length;
	 int rest= LeaderElement(a,n);
        if(rest!=-1) {
        	System.out.println("Leader Element is::"+rest);
        }
        else {
        	System.out.println("Not available");
        }
	}

	public static int LeaderElement(int[] a, int n) {
		for(int i=0;i<=n/2;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[j]==a[i]) {
					count++;
				}//if
			}//innnerloop
			if(count>n/2) {
				return a[i];
			}
		}//outer loop
		return -1;
	}

}
