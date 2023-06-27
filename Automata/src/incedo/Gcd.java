package incedo;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		System.out.println(gcd(n, m));
		
	}
	static int gcd(int n,int m) {
		int res=0;
		for(int i=2;i<n||i<m;i++) {
			if(n%i==0 && m%i==0) {
				res=i;
			}
		}
		return res;
	}

}
