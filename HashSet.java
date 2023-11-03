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
       // System.out.println(set1);

        // //searching -  contains()
        // if(set1.contains(1))
        // {
        //     System.out.println("yes it contains: 1");
        // }

        // //not  contains
        // if(!set1.contains(6))
        // {
        //     System.out.println("does not contain");
        // }

        // //delete - remove()
        // set1.remove(1);
        // if(!set1.contains(1))
        //     System.out.println("does not contain 1");
        // System.out.println(set1);

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
