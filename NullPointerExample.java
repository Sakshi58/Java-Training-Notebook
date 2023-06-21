///NullPointer exception 

class NullPointerExample
{
	void func()
	{	
		System.out.println("function working ");
	}
	public static void main(String args[])
	{
		nullpointerexample obj = null;
		//obj = new nullpointerexample();

		obj.func();
	}
}
