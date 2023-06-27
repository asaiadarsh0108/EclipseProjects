package String;

import java.util.StringTokenizer;

public class Stringtokenizers {
	public static void main(String[] args) {
		
		StringTokenizer s = new StringTokenizer("Sai Adarsh is a Java developer"," ");
		
		while(s.hasMoreTokens()) {
			System.out.println(s.countTokens());//count the number of delimiters left
			System.out.println(s.nextToken());//returns the next token
			System.out.println(s.nextElement());
			System.out.println(s.hasMoreTokens());//returns a boolean value whether it has tokens lest or not
		}
		
	}
}
