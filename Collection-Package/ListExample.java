import java.util.List;
import java.util.ArrayList;
//import java.util.*;

public class ListExample 
{
    ListExample()
    {
        List ls = new ArrayList();
        
        ls.add("sourav");
        ls.add("satyam");
        ls.add("shruti");
        ls.add(420);
        ls.add("vimal");
        ls.add(56.21);
        ls.add("vanshika");
        ls.add(420);
        ls.add("");                             ///can store null value
        
        System.out.println(ls);
        System.out.println("no. of items = "+ls.size());
    }
    public static  void main(String args[])
    {
        ListExample obj = new ListExample();
    }
}
