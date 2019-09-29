package com.nt.assignment2;

import java.util.Arrays;

public class Q4Segrgate_0sAnd1sAnd2s_Array {

	public static void main(String[] args) {
		int[] a= {0, 1, 0, 2, 0, 0, 2, 1, 2, 0};
		int n=a.length;
		segregate012(a,n);
		print(a,n);
	}

	public static void print(int[] a, int n) {
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(a));
		}
		
	}

	public static void segregate012(int[] a, int n) {
		int i,cnt0=0,cnt1=0,cnt2=0;
		for(i=0;i<n;i++) {
			if(a[i]==0)
				cnt0++;
			else if(a[i]==1)
			     cnt1++;
			else
				cnt2++;
		}
		System.out.println("0:"+cnt0+"  "+"1:"+cnt1+"  "+"2:"+cnt2);
		
		for(i=0;i<cnt0;i++)
			a[i]=0;
		for(i=cnt0;i<(cnt0+cnt1);i++)
			a[i]=1;
		for(i=(cnt0+cnt1);i<n;i++)
			a[i]=2;
	}

}
