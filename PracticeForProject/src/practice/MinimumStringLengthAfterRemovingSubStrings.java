package practice;

public class MinimumStringLengthAfterRemovingSubStrings {

	public static void main(String[] args) {
		String str="ACBBD";
		int len=str.length();
		while(str.contains("AB")|| str.contains("CD")) {
			if(str.contains("AB")) {
				int i=str.indexOf("AB");
				str = str.substring(0,i)+str.substring(i+2);
			}
			if(str.contains("CD")) {
				int i=str.indexOf("CD");
				str = str.substring(0,i)+str.substring(i+2);
			}
		}
		System.out.println(str.length());
	}
}
