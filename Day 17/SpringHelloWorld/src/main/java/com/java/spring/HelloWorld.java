package com.java.spring;

public class HelloWorld {

		private String greeting;
		public String getGreeting() {
			return greeting;
		}
		public void setGreeting(String greeting) {
			this.greeting = greeting;
		}
		
		public String show(String name) {
			return greeting+name;
		}
		
		
}
