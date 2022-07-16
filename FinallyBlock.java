public class finallyTest 
{
    public static void main(String[] args) 
    {
      try
    {
       int a=45;
       int b=0;
       int c = a/b;
    }
   catch(ArithmeticException e)
   {
       System.out.println(e);
   }
   finally
   {
       System.out.println("The finally block always run ");
   }
 }
    
}
