package incedo;

import java.util.Scanner;
class listOfPrimes{
	static void findAllPrimes(int n) {
		for(int i=2;i<n;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}
}
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		listOfPrimes obj = new listOfPrimes();
		obj.findAllPrimes(n);
	}
}
