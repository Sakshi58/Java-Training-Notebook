import java.util.Scanner;

class ExceptionDemo
{
	void func1()
	{
		try
		{
			int ar[]=new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter elements in array");

			for(int i=0; i<5; i++)
			{
				ar[i]=sc.nextInt();
			}
			System.out.println("-----array elements---------");

			for(int i=0; i<=5; i++)
			{
				System.out.println(ar[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println(e);
		}

	}
	void func2()
	{	
		System.out.println("Second function is  working");
	}
	public static void main(String args[])
	{
		ExceptionDemo obj= new ExceptionDemo();
		obj.func1();
		obj.func2();
	}
}
