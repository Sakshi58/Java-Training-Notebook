import java.util.HashSet;
import java.util.Iterator;

public class hashing {
    public static void main(String[] args)
    {
        //creation
        HashSet<Integer> set1= new HashSet<>();
        ///same as ArrayList creation

        //insertion
        //list.add(element);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(6);
        set1.add(8);
        set1.add(1);        ///no duplicate values allowed only unique values
        set1.add(4);
        set1.add(5);

        //size()
        System.out.println("size = "+set1.size());
      
        ///Iterator  
        Iterator it = set1.iterator();
        /*it has  two functions 
            1. hasNext()
            2. next();
            
            hasNext() - returns  true or false 
            next() - returns next element 
        
        */
        // working of iterator
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
