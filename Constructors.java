
///base class
class amity
{
	amity()
	{
		System.out.println("Non parameterised constructor--amity-- base");
	}
	amity(int x)
	{
		System.out.println("parameterised constructor--amity-- base");
	}
}

//derived class
class Constructors extends amity
{
	
	///non-parameterized Constructor
	Constructors()
	{
		System.out.println("Non parameterised constructor--global--derived");
	}
	
	///parameterized Constructor
	Constructors(int y)
	{  
                super(y);
		System.out.println("parameterised constructor--global--derived");
		
	}
	public static void main(String args[])
	{
		Constructors obj = new Constructors(150);
		
	}
}
