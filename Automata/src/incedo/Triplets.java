package incedo;

import java.util.Scanner;

public class Triplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar= new int[n];
		for(int i=0;i<n;i++) {
			ar[i]= sc.nextInt();
		}
		findAllTriplets obj= new findAllTriplets();
		obj.findAllTriplets(ar, n);
	}
}
class findAllTriplets{
	static void findAllTriplets(int[] a, int n) {
		for(int i=0;i<n-2;i++) {
			int x=a[i];
			for(int j=i+1;j<n-1;j++) {
				int y=a[j];
				for(int k=j+1;k<n;k++) {
					int z=a[k];
					if(x+y>z && y+z>x && z+x>y) {
						System.out.println(x+" "+y+" "+z );
					}
				}
				
			}
			
		}
	}
}