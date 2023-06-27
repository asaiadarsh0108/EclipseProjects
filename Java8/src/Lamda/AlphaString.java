package Lamda;

import java.util.stream.Stream;
import java.util.*;

public class AlphaString {
	public static void main(String[] args) {
		String s = "GeeksForGeeks";
		boolean isAlpha = s.chars().allMatch(c->Character.isAlphabetic(c));
		System.out.println(isAlpha);
	}
}


