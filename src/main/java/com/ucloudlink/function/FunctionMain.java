package com.ucloudlink.function;

public class FunctionMain 
{
	public static void main(String args[])
	{
		FunctionJ<String,String> functionJ = (x) ->{System.out.println(x);
		return x;
		};
		
		functionJ.getFunction("hello");
		
	}

}
