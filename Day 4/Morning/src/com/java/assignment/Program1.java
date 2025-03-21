package com.java.assignment;

import java.util.Scanner;

public class Program1 {
	
	public int getStringLength(String str) {
		int count = 0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			count++;
			
		}
		return count;
	}
	
	public String setStringUpper(String str) {
		char[] ch = str.toCharArray();
		String result = "";
		for (char c : ch) {
			if((int)c >=97 && (int)c <=122) {
				result+=(char)((int)c - 32);
			}
			else {
				result+=c;
			} 
		}
		return result;
	}
	
	public String setStringLower(String str) {
		char[] ch = str.toCharArray();
		String result = "";
		for (char c : ch) {
			if((int)c >=65 && (int)c <=90) {
				result+=(char)((int)c + 32);
			}
			else {
				result+=c;
			} 
		}
		return result;
	}
	
	public int charPosition(String str, char n) {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==n) {
				return i;
			}
			
		}
		return 0;
	}
	
	public char charAt(String str, int index) {
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(index==i) {
				return ch[i];
			}
			
		}
		return 0;
	}
	
	public int countOccurrences(String str, char ch) {
	    char[] charArr = str.toCharArray();
	    int count = 0;
	    for (char c : charArr) {
	        if (c == ch) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public String replaceChar(String str, char oldChar, char newChar) {
	    char[] ch = str.toCharArray();
	    String result = "";
	    for (char c : ch) {
	        if (c == oldChar) {
	            result += newChar;
	        } else {
	            result += c;
	        }
	    }
	    return result;
	}
	
	public String StringEquals(String str1, String str2) {
	    char[] ch1 = str1.toCharArray();
	    char[] ch2 = str2.toCharArray();
	    if (ch1.length != ch2.length) {
	        return "Strings are not equal";
	    }
	    for (int i = 0; i < ch1.length; i++) {
	        if (ch1[i] != ch2[i]) {
	            return "Strings are not equal";
	        }
	    }
	    return "String are equal";
	}
	
	public String reverseString(String str) {
	    char[] ch = str.toCharArray();
	    String result = "";
	    for (int i = ch.length - 1; i >= 0; i--) {
	        result += ch[i];
	    }
	    return result;
	}
	
	public String getSubstring(String str, int start, int end) {
	    char[] ch = str.toCharArray();
	    String result = "";
	    for (int i = start; i < end && i < ch.length; i++) {
	        result += ch[i];
	    }
	    return result;
	}
	
	public String getSubstringLast(String str, int start) {
	    char[] ch = str.toCharArray();
	    String result = "";
	    int end = str.length();
	    for (int i = start; i < end && i < ch.length; i++) {
	        result += ch[i];
	    }
	    return result;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		Program1 obj = new Program1();
		System.out.println("1. Length of a string is "+ obj.getStringLength(str));
		System.out.println("-----------------");
		System.out.println("2. Capitalizing string : "+obj.setStringUpper(str));
		System.out.println("-----------------");
		System.out.println("3. De-Capitalizing string : "+obj.setStringLower(str));
		System.out.println("-----------------");
		System.out.println("Enter a charater to find it's location ");
		char n = sc.next().charAt(0);
		System.out.println("4. Character "+n+" found at index "+obj.charPosition(str, n));
		System.out.println("-----------------");
		System.out.println("Enter Character index to find character present");
		int x = sc.nextInt();
		System.out.println("5. Character at index "+ x +" is "+ obj.charAt(str, x));
		System.out.println("-----------------");
		System.out.println("Enter a character to check occurance :");
		char m = sc.next().charAt(0);
		System.out.println("6. Number of occurance of character "+m+ " is "+obj.countOccurrences(str, m));
		System.out.println("-----------------");
		System.out.println("Enter a character to be replaced : ");
		char old = sc.next().charAt(0);
		System.out.println("Enter the replacing character : ");
		char ne = sc.next().charAt(0);
		System.out.println("7. New string after replacing character is "+obj.replaceChar(str, old, ne));
		System.out.println("-----------------");
		System.out.println("Enter a new string to check is equal to above");
		String st = sc.next();
		System.out.println("8 "+obj.StringEquals(str, st));
		System.out.println("-----------------");
		System.out.println("9. Reversed string is "+obj.reverseString(str));
		System.out.println("-----------------");
		System.out.println("Enter starting index position to form substring");
		int a = sc.nextInt();
		System.out.println("Enter ending index position to form substring");
		int b = sc.nextInt();
		System.out.println("10. The substring formed is "+obj.getSubstring(str, a, b));
		System.out.println("Substring formed from first position "+obj.getSubstringLast(str, a));
		System.out.println("-----------------");
		
		
	}

}
