package com.java.jdk8;

//Encoded in DataOut.java
//Decoding here in DataIn.java

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("C:/files/dataout.txt");
			DataInputStream din = new DataInputStream(fin);
			int x = din.readInt();
			String name = din.readUTF();
			double bas =din.readDouble();
			boolean flag = din.readBoolean();
			System.out.println(x);
			System.out.println(name);
			System.out.println(bas);
			System.out.println(flag);
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
