package com.java.sup;

public class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno,String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}
//	class ash extends Employ{
//
//		public ash(int empno, String name, double basic) {
//			super(empno, name, basic);
//			// TODO Auto-generated constructor stub
//		}
//		
//	}
	

