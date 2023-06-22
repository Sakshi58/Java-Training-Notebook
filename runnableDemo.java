//////----Runnable in Java Thread-----/////

class abc
{
	void func()
	{
		System.out.println("function is  working");
	}
}
class runnableDemo extends abc implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String args[])
	{
		runnableDemo rn= new runnableDemo();
		Thread th= new Thread(rn);
		th.start();
	}
}
