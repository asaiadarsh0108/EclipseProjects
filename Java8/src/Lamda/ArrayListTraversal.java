package Lamda;

import java.util.ArrayList;

public class ArrayListTraversal {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach(n->System.out.println(n));
		
		list.forEach(n->{
			if(n%2==0)
				System.out.println(n);
		});
		
	}
}
