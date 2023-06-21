//custom exception means that we can create our own exceptions that are derived classes of the Exception class.
//Creating our own Exception is known as custom exception or user-defined exception

import java.util.*;

class AgeException extends Exception						                  ////Custom Exception 
{
	AgeException()							                                   ////class constructor 
	{
		System.out.println("under age problem");
	}
}

class CustomExceptionExample
{
	void func()
	{
		try
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the age : ");
			int age = sc.nextInt();
	
			if(age>=18)
			{
				System.out.println("vote done!!!");
			}
			else			
			{
				throw new AgeException();			                          ///exception object creation
			}
		}
		catch(AgeException e)					                             ///calling the exception
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("next voter will come !!!");
		}
	}
	public static void main(String args[])
	{
		CustomExceptionExample obj = new CustomExceptionExample();
		obj.func();
	}
}
