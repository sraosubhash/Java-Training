package Day2;

import java.util.Scanner;

public class ArrayDemo2 {
	
	static Scanner sc = new Scanner(System.in);
	public static void show(int n) {
		int [] a = new int[n];
		System.out.println("Enter "+n+" Elements to array");
		for(int i=0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array Elemnts are ");
		for (int i : a) {
			System.out.println(i);
		}
	}


	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter value of n");
		n = sc.nextInt();
		new ArrayDemo2().show(n);
				

	}

}
