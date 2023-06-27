package practice;

import java.util.Scanner;

public class SumOfNumbersUsingRecursion {
	static int sum(int n) {
		while(n>0) {
			return n+sum(n-1);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=sum(n);
		System.out.println(sum);
	}

}
