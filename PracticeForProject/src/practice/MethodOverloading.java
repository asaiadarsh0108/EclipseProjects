package practice;

import java.util.Scanner;

public class MethodOverloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,res=0;
		Scanner sc = new Scanner(System.in);
//		a=sc.nextInt();
//		b=sc.nextInt();
//		c=sc.nextInt();
		MethodOverloading obj= new MethodOverloading();
//		System.out.println("Sum of A and B is:"+ obj.foo(a,b));
//		System.out.println("Sum of A and B and C is:"+ obj.foo(a,b,c));
		int[] arr= new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("sum of the array is :"+ array(arr));
		

	}

	  int foo(int a, int b) {
		// TODO Auto-generated method stub
		 return a+b;
		
	}
	  int foo(int a,int b,int c) {
		 return a+b+c;
	 }
	  public static int array(int [] arr) {
		  int res=0;
		  for(int j:arr) {
			  res=res+j;
		  }
		  return res;
	  }

}
