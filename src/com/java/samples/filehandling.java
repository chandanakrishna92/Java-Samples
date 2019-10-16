package com.java.samples;

import java.io.File;
import java.io.FileWriter;

public class filehandling  {
	public static void main(String[] args) throws Exception {
	file f1 = new File("c://dinga.txt");
		FileWriter fw = new FileWriter(f1);
		f1.FileWriter("hello java");
		f1.flush();
		System.out.println("it is a data");

	}

}
