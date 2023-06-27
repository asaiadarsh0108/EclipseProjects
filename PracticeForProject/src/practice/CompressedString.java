package practice;

import java.util.ArrayList;
import java.util.List;


public class CompressedString {
	public static void main(String[] args) {
		String str= "xxxeetssx";
		int n =str.length();
		char[] cha= str.toCharArray();
		List<CharacterCount> characterCount = new ArrayList<CharacterCount>();
		for(int i=0;i<n;i++) {
			char currentChar=cha[i];
			int count=1;
//			while(i+1<n && cha[i+1]==cha[i]) {
//				count++;
//				i++;
//			}
			for(int j=i+1;j<n-1;j++) {
				if(cha[i]==cha[j]) {
					count++;
					i++;
				}
			}
			characterCount.add(new CharacterCount(currentChar, count));
		}
		System.out.println(characterCount);
		for(CharacterCount chC :characterCount) {
			char c= chC.ch;
			int co=chC.count;
			printChar(c,co);
		}
	}

	private static void printChar(char c, int co) {
		// TODO Auto-generated method stub
		if(co>1) {
			System.out.print(c+""+co);
		}
		else {
			System.out.print(c);
		}
		
		
	}
}
 class CharacterCount{
	 char ch;
	 int count;
	 
	 public CharacterCount(char ch, int count) {
		 this.ch=ch;
		 this.count=count;
	
	 }

	@Override
	public String toString() {
		return "CharacterCount [ch=" + ch + ", count=" + count + "]";
	}
	 
 }