package com.java.cols;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {
	
	public static void main(String[] args) {
		
		Map<String, String> userData = new Hashtable<String, String>();
		
		userData.put("First", "Last");
		userData.put("Subhash", "Rao");
		userData.put("Harshitha", "Jijambhe");
		userData.put("Sonia", "Miss22k");
		
		String username,password,result;
		System.out.println("Enter username and Password");
		Scanner sc = new Scanner(System.in);
		username = sc.next();
		password = sc.next();
		result = userData.getOrDefault(username, "User Not Found");
		if (result.equals(password)) {
			System.out.println("Correct Credentials..");
			
		}else {
			System.out.println("Invalid Credentials..");
		}
	}

}
