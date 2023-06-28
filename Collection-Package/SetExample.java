import java.util.*;

public class SetExample 
{
    void func()
    {
        Set st = new HashSet();
        
        ///.add() to add items into the  hashset
        st.add("maggie");
        st.add(2000);
        st.add("Coke");
        st.add(5.6);
        st.add("zeher");
        st.add("Tree");
        st.add(6952);
        st.add("ZEHER");
        
        ///contains() for searching of the list item
        if(st.contains("Coke"))
        {
            System.out.println(st);
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
//        System.out.println(st);
        System.out.println("No. of items : "+st.size());
    }   
    public static void main(String[] args) 
    {
        SetExample obj =  new SetExample();
        obj.func();
    }
}
