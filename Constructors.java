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


class Constructors extends amity
{
	Constructors()
	{
		System.out.println("Non parameterised constructor--global--derived");
	}
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
