package com.nt.assignment1;

public class Q8CommonsElement {

	public static void main(String[] args) {
		int[]a1= {1,5,10,20,40,80};
		int[]a2= {6,7,20,80,100};
		int[]a3= {3,4,15,20,30,70,80,120};
		findCommon(a1,a2,a3);	
	}

	 static void findCommon(int[] a1, int[] a2, int[] a3) {
	  System.out.println("Commons Element in Array are::");
	  int i=0,j=0,k=0;
	  while(i<a1.length && j<a2.length && k<a3.length) {
		  if(a1[i]==a2[j]&&a2[j]==a3[k]) {
			  System.out.println(a1[i]+" ");
			  i++;
			  j++;
			  k++;
		  }
		  else if(a1[i]<a2[j])
			  i++;
		  else if(a2[j]<a3[k])
			  j++;
		  else
			  k++;
	  }//while
	}
}//class
