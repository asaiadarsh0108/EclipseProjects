package Lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashmap {
	public static void main(String[] args) {
		ArrayList<KeyValuePairs> list = new ArrayList<KeyValuePairs>();
		
		list.add(new KeyValuePairs(1,"I"));
		list.add(new KeyValuePairs(2,"Love"));
		list.add(new KeyValuePairs(3,"Java"));
		
		Map <Integer, String> map = new HashMap<>();
		
		list.forEach(n->{map.put(n.getKey(), n.getValue());});
			
		System.out.println("Map:"+ map);
	}
}

class KeyValuePairs{
	int key;
	String value;
	
	public KeyValuePairs(int id , String name) {
		this.key=id;
		this.value=name;
	}
	public int getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
}