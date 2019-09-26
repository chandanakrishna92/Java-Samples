package com.java.samples;
public class stackunwindaning {
	static void disp4() throws ArithmeticException {
		int i = 1 / 2;
	}

	static void disp3() {
		disp4();
	}

	static void disp2() {
		disp3();
	}

	static void disp() {
		disp2();
	}

	public static void main(String[] args) {
		disp();
	}
}
