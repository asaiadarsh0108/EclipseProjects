package DP;

import java.util.Scanner;

public class Frog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		String s = sc.nextLine();
		String replace=s.replace("a", "i");
		System.out.println(replace);
//		int[] h = new int[n];
//		for(int i=0;i<n;i++) {
//			h[i]=sc.nextInt();
//		}
//		int sum=0;
//		int j=0;
//		for(j=0;j<=n-2;j++) {
//			if(h[j+1]>h[j+2]) {
//				sum = sum+h[j+1]-h[j];
//			}
//			else {
//				sum= sum + h[j+2]-h[j];
//				j=j+1;
//			}
//		}
//		if(j==n-1) {
//			sum= sum+h[j]-h[n-1];
//		}
//		System.out.println(sum);
	}

}
