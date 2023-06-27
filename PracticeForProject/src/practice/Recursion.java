package practice;

import java.util.Scanner;

public class Recursion {
	static int factorial(int n) {
		while(n>0) {
			return n*factorial(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=factorial(n);
		System.out.println("Factorial of "+n+" is:"+x);

	}

}
