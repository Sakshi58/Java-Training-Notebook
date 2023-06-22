///Multilevel Inheritance 

////base class 
class google
{
	void cloud()
	{
		System.out.println("cloud...");
	}
}
class microsoft extends google
{
	void azure()
	{
		System.out.println("azure...");
	}
}


///derived class
class   MultiLevelInheritance extends microsoft
{
	void dbms()
	{
		System.out.println("sql...");
	}
	public static void main(String args[])
	{
		MultiLevelInheritance obj = new MultiLevelInheritance();
		obj.dbms();
		obj.azure();
		obj.cloud();
	}
}
