package com.java.properties;

public class ReadWrite {
	
	private int empno;
	private String name;
	private double basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
	public static void main(String[] args) {
		ReadWrite obj1 = new ReadWrite();
		obj1.setBasic(32827);
		obj1.setEmpno(101);
		obj1.setName("ASH");
		System.out.println("Employee no : "+obj1.getEmpno());
		System.out.println("Employee name : "+obj1.getName());
		System.out.println("Employee basic : "+obj1.getBasic());
	}

}
