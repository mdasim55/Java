// Set store only unique elements... 

import java.util.HashSet;
import java.util.Iterator;

public class H1_HashSet { 
    public static void main(String[] args) {
        // 1. Creating Objects..
        HashSet<Integer> set = new HashSet<>();

        // 2. Add elements...add() --> O(n);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);         // Here 1 does not add in the set because it is duplicate element...
        
        // 3. Search -> Contains O(n)
        if(set.contains(3)) {
            System.out.println("The 3 is present in the set.");
        } else {
            System.out.println("The 3 is not present in the set.");
        }

        // 4. Delete --> remove() --> O(1)
        set.remove(3);
        if(set.contains(3)) {
            System.out.println("The 3 is present in the set.");
        } else {
            System.out.println("After deletion 3 is not present in the set.");
        }

        // 5. Print the size...
        System.out.println("The size of the setr is: "+set.size());

        // 6. print all elements..
        System.out.println(set);

        // 7. Iterator...
        Iterator<Integer> it = set.iterator();           // Required: import java.util.Iterator
        // next, hasNext
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}