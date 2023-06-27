package com.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidationUsingMap {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("sai", "sai@123");
		map.put("adarsh", "adarsh@123");
		map.put("pavan", "pavan@123");
		System.out.println("enter the username");
		boolean isLogin=false;
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		for(String key : map.keySet()) {
			if(username.equals(key)) {
				System.out.println("enter the password");
				String password = sc.next();
				String value = map.get(username);
				if(password.equals(value)) {
					System.out.println("Welcome , login succesful");
					isLogin=true;
					break;
				}
			}
		}
		if(isLogin==false) {
			System.out.println("Login denied");
		}
	}
}
