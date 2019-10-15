package com.java.samples;
class shadidotcom
{
	static void submit()  throws shadidotException
	{
		 int age=11;
		if (age>=21)
		{
			System.out.println("happy life");
		}
		else
		{
	 throw new shadidotException("invalid age boss");
		}
	}

public static void main( String[] args) 
	{
		try {
			submit();
		} 
		catch ( shadidotException e) 
		{
			System.out.println(e.getmsg());
		}
	}
}
	class shadidotException extends Exception 
	{
		String msg;

	shadidotException( String msg)
	{
		this.msg=msg;
	}

	public String getmsg()
	{

	return msg;
	}
}

