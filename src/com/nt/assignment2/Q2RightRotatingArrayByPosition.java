package com.nt.assignment2;

import java.util.Arrays;

public class Q2RightRotatingArrayByPosition {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int n=a.length;
		int a1[]=new int[3];
		int a2[]=new int[n-3];
		int j=0;
		
		for(int i=0;i<n;i++) {
			if(i<a1.length) {
				a1[i]=a[i];
			}
			else if(i>=2) {
				a2[j]=a[i];
				j++;
			}
		}//for
		
		
		
		int concate[]=new int[a1.length+a2.length];
       System.arraycopy(a2,0,concate,0,a2.length);
       System.arraycopy(a1, 0, concate,a2.length, a1.length);
       System.out.println(Arrays.toString(concate));
       int temp,i,p=1;
       temp=concate[0];
       for(i=0;i<p;i++) {
    	   concate[i]=concate[i+1];
    	  concate[i+1]=temp; 
       }
       System.out.println(Arrays.toString(concate));
	
	}

}
