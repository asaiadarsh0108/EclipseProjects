package practice;

import java.util.Scanner;

public class FibonacciSeries {
	static void fibonacci(int n) {
		//list of elements in the fibonocci series
		int [] a= new int[n];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for(int i:a){
			System.out.print(i+" ");
		}
		//Nth element in the fibonocci series
//		int x=1;
//		int y=1;
//		int z=0;
//		for(int j=2;j<n;j++) {
//			z=x+y;
//			x=y;
//			y=z;
//		}
//		System.out.println(z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		fibonacci(n);

	}

}
