package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortingArrayBasedOnFrequency {
	public static void main(String[] args) {
		int[] ar= {1,1,2};
		int n = ar.length;
		List<NumberCount> numberCount = new ArrayList<>();
//		Map<Integer,Integer> map = new TreeMap();
//		
//		for(int i=0;i<n;i++)
//		{
//			if(map.get(ar[i]) != null)
//			{
//				map.put(ar[i], map.get(ar[i])+1);
//				
//			}
//			else
//			{
//				map.put(ar[i],1);
//			}
//		}
//		map.forEach((k,v)->{
//			numberCount.add(new NumberCount(k, v));
//		});
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j:ar) {
				if(j==i) {
					count++;
				}
			}
			if(count>0) {
				numberCount.add(new NumberCount(ar[i],count));
			}
		}
//		Iterator<NumberCount> iterator = numberCount.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//	}
		numberCount.sort((a,b)-> a.count - b.count);
		for(NumberCount nc: numberCount) {
			int num= nc.num;
			int count= nc.count;
			printNTimes(num,count);
		}

}
 private static void printNTimes(int num, int count) {
		// TODO Auto-generated method stub
	 if(count>0) {
		 for(int i=0;i<count;i++) {
			 System.out.print(num+" ");
		 }
	 }
		
	}
}
class NumberCount{
	 int num;
	 int count;
	 public NumberCount(int num, int count) {
		 this.num=num;
		 this.count=count;
	 }
//	@Override
//	public String toString() {
//		return "NumberCount [num=" + num + ", count=" + count + "]";
//	} 
 }