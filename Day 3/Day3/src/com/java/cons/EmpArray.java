package com.java.cons;


public class EmpArray {
	
	public static void main(String[] args) {
		Employ [] arr = new Employ [] {
				new Employ(1,"ASH",47238),
				new Employ(2,"Subhash",29638),
				new Employ(3,"Zoro",99999)
		};
		
		for (Employ e : arr) {
			System.out.println(e);
		}
	}

}
