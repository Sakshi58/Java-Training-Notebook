/////-----MultiThreading in Java----/////

/////Thread 1 
class thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=15; i++)
			{
				System.out.println(i+"  Hello");
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

////Thread 2
class thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=50; i<=100; i+=2)
			{
				System.out.println(i+"-----------Heyy");
				sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

////Thread 3
class thread3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=100; i<=150; i+=2)
			{
				System.out.println(i+"............Hiiii");
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

///main class
class MultiThread 
{
	public static void main(String args[])
	{
		thread1 t1= new thread1();                            ///thread instantiated
		thread2 t2= new thread2();
		thread3 t3= new thread3();

		t1.start();
		t2.start();
		t3.start();
	}
}
