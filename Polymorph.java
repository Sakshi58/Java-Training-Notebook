
////--------------polymorphism in Java---------//////
class polymorph			 
{	
	void btech()
	{
		System.out.println("btech from CS");
	}
	void btech(int acc)
	{
		System.out.println("btech from EC");
	}
	void btech(int acc, String x)
	{
		System.out.println("btech from Civil");
	}
	void btech(String x, int acc)
	{
		System.out.println("btech from Mechanical");
	}
	public static void main(String args[])
	{
		polymorph con = new polymorph();
		con.btech("java",1515);
	}
}
