package incedo;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] ar= new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		arrangement(ar);
		rearrangeArray(ar);
		System.out.println(Arrays.toString(ar));
	}
	private static void arrangement(int[] ar) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.print(ar[i]+" ");
			}
		}
		for(int j=0;j<ar.length;j++) {
			if(ar[j]%2!=0) {
				System.out.print(ar[j]+" ");
			}
		}
	}
		
	public static void rearrangeArray(int[] arr) {
	    int i = 0; // pointer for even numbers
	    int j = arr.length - 1; // pointer for odd numbers
	    while (i < j) {
	        // move i pointer to the right until we find an even number
	        while (arr[i] % 2 == 0 && i < j) {
	            i++;
	        }
	        // move j pointer to the left until we find an odd number
	        while (arr[j] % 2 != 0 && i < j) {
	            j--;
	        }
	        // swap the even and odd numbers
	        if (i < j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }
	}

}
