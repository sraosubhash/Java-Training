package com.java.jdk8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) {
		
		File src = new File("C:/Java Training/Day 6/jdk8Features/src/com/java/jdk8/Emp.java");
		File tar = new File("C:/files/Emp.txt");
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(tar);
			int ch;
			while ((ch = fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("**** File Copied Sucessfully****");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
