package practice;

import java.util.Scanner;

public class MinimumBags {
	public static void main(String[] args) {
		int bigBag= 8;
		int smallBag=3;
		Scanner sc = new Scanner(System.in);
		int required = sc.nextInt();
		int minimumBags = CalculateBags(bigBag,smallBag,required);
		if(minimumBags==-1) {
			System.out.println("Not Possible");
		}
		else
			System.out.println("Possible:"+ minimumBags);
		
	}
	
	public static int CalculateBags(int big, int small, int req) {
		int maxBigBags = req/big;
		int x=maxBigBags;
		for(int i= x; i>=0;i--) {
			int rem = req- (big*i);
			int maxSmallBags = rem/small;
			maxBigBags=i;
			
			
			if(rem%small==0) {
				System.out.println(maxBigBags);
				return maxSmallBags+maxBigBags;
			}
		}
		return -1;
	}
}
