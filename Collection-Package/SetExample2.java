import java.util.*;

public class SetExample2 
{
    SetExample2()
    {
        Set st2 = new HashSet();
        
        st2.add("Coke");
        st2.add("Maggie");
        st2.add("Mazaa");
        st2.add("Yippee");
        st2.add("Pepsi");
        st2.add("Frootie");
        
        System.out.println(st2);
        System.out.println("Nos : "+st2.size());
        
        System.out.println("Enter Searching element: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        
        if(st2.contains(str))
        {
            System.out.println("Found");
        } 
        else
        {   
               System.out.println("Not Found");
        }
    }
    public static void main(String[] args) 
    {
        SetExample2 obj = new SetExample2();
        
    }
}
