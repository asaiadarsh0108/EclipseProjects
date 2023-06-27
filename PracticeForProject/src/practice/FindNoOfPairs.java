package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindNoOfPairs {
	public static void main(String[] args) {
		int[] ar= {1,1,2,2};
		int n = ar.length;
		List<FrequencyCount> numberCount = new ArrayList<>();

		for(int i=0;i<n;i++) {
			int count=0;
			for(int j:ar) {
				if(j==i) {
					count++;
				}
			}
			if(count>0) {
				numberCount.add(new FrequencyCount(ar[i],count));
			}
		}
		for(FrequencyCount nc: numberCount) {
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
class FrequencyCount{
	 int num;
	 int count;
	 public FrequencyCount(int num, int count) {
		 this.num=num;
		 this.count=count;
	 }

 }