package incedo;

import java.util.Scanner;

public class UserSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the Array:");
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		System.out.println("Enter the elements of Array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the user Number:");
		int userNumber= sc.nextInt();
		findSum(arr,n,userNumber);
		
	}

	private static void findSum(int[] a, int n, int userNumber) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<n;i++) {
			if(a[i]==userNumber) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
		
	}
}
