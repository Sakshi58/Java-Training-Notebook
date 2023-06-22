
///Single Thread methods 
class ThreadDemo extends Thread
{
	public void run()						/// run()  is used to do an action for a thread.
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(getName());
				sleep(1000);			 ///sleeps a thread for the specified amount of time----it will show interruptedException 
				/*if(i==5)
				{
					stop();			///forcefully stops the thread
				}*/
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])	
	{
		ThreadDemo obj = new ThreadDemo();
		obj.setName("Pune");				////The getName() method of thread class is used to return the name of thread
		obj.start();						///start() method runs the  run() method
		///start() is used to start the execution of the thread.
	}
}
