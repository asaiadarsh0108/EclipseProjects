package practice;

import java.util.Scanner;

public class PassingArraysToMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=sc.nextInt();
		int [] arr= new int[n];
		PassingArraysToMethods obj= new PassingArraysToMethods();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res= obj.arraySum(arr);
		System.out.println("Sum of the Array Elements is : "+res);

	}

	private static int arraySum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i : arr) {
			sum+=i;
//			System.out.println(i);
		}
		return sum;
	}

}
