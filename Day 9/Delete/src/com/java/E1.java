package com.java;

//public class E1 {
//
//static {
//try {throw new ArithmeticException("my exception");
//
//}
//catch(ArithmeticException e) {
//System.out.println("3");
//}
//catch(Exception e){
//System.out.println("2");
//}
//}
//
//public static void main(String[] args){
//System.out.println("1");
//}
//}

public class E1 {
static {
try {throw new ArithmeticException("my exception");

}
catch(Exception e){
System.out.println("2");
}
}

public static void main(String[] args){
System.out.println("1");
}
}