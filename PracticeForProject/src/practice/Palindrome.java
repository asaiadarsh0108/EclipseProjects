package practice;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2= sc.next();
		if(s1.toLowerCase().equals(s2.toLowerCase()))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
