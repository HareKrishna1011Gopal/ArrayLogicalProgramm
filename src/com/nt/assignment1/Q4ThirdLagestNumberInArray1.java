package com.nt.assignment1;

import java.util.Arrays;

public class Q4ThirdLagestNumberInArray1 {

	public static void main(String[] args) {
    System.out.println("--Third largest Number--");
		 int[] a= {6,8,1,9,2,1,10};
		//int[] a= {6,8,1,9,2,1,10,12,10};
		//int[] a= {6};
		 Arrays.sort(a);
		 int aLength=a.length;
		 System.out.println("length::"+aLength+" "+Arrays.toString(a));
		 if(aLength<3) {
			 System.out.println("Invalid IP arrays size is less then 3");
		 }
		 else {
		 System.out.println(a[a.length-3]);
		 }
	}

}
