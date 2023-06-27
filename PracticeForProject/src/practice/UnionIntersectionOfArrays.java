package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionOfArrays {
	public static void main(String[] args) {
		
		int[] arr1 = {7, 1, 5, 2, 3, 6};
		int[] arr2 = {3, 8, 6, 20, 7};
		
		Set<Integer> unionSet = findUnionOfArray(arr1,arr2);
		Set<Integer> intersectionSet= findIntersection(arr1,arr2);
		System.out.println(unionSet);
		System.out.println(intersectionSet);
	}

	private static Set<Integer> findUnionOfArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		Set<Integer> unionSet= new HashSet<Integer>();
		for(int i : arr1 ) {
			unionSet.add(i);
		}
		for(int i: arr2) {
			unionSet.add(i);
		}
		return unionSet;
	}

	private static Set<Integer> findIntersection(int[] arr1, int[] arr2){
		
		Set<Integer> intersectionSet= new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(int i: arr1) {
			set1.add(i);
		}
		for(int i: arr2) {
			if(set1.contains(i)) {
				intersectionSet.add(i);
			}
		}
		return intersectionSet;
	}
}
