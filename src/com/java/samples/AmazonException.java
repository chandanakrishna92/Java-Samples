package com.java.samples;
 class AmazonException1  extends Exception
 {
	String msg;
	AmazonException1(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
 }
 class  AmazonException
 {
static void orders() throws AmazonException1
{
	int pant =3000;
	if(pant>=4000)
	{
		System.out.println("great discount of 500rs");
	}else {
		throw new AmazonException1("no discount");
	}
}
public static void main(String[] args) 
{
	try {
		orders();
	}
	catch(AmazonException1 e)
	{
		System.out.println(e.getmsg());
		}
}
 }
