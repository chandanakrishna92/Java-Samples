package com.java.samples;
public class encpasulation {
	private int a=10;
	public int getA()
	{
		return a;
		
	}
public void setA(int a)
this.a=a;
}
class demo5
{
	public static void main(String [] args)
{
encapsulation e1=new encapsulation();
System.out.println(e1.getA);
e1.setA(12);
System.out.println(e1.getA);
}
}
}
