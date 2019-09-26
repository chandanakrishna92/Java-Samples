package com.java.samples;
import java.util.Scanner;
public class Add2numbers {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = a + b;
		System.out.println(c);
		}

}
