package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GamingArray {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			int size=sc.nextInt();
			for(int j=0;j<size;j++) {
				int x= sc.nextInt();
				list.add(x);
			}
			System.out.println(list);
			function(list);
		}
	}

	private static void function(List<Integer> list) {
		// TODO Auto-generated method stub
		int count=0;
		while(list.size()!=0) {
			int max =Collections.max(list);
			int k=list.indexOf(max);
			for(int i=list.size()-1;i>=k;i--) {
				list.remove(i);
			}
			count++;
		}
		if(count%2==0) {
			System.out.println("Andy");
		}
		else
			System.out.println("Bob");
	}

}
