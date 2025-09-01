// 6. Sorting of an ArrayList...

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_6 {
    public static void main(String[] Args) {
        // ClassName ObjName = new ClassName();                  // Create a Object
        ArrayList<Integer> list1 = new ArrayList<>();            // Create an integer ArrayList
        
        list1.add(5);             
        list1.add(8);             
        list1.add(3);             
        list1.add(9);             
        list1.add(2);
        
        // // Ascending order...
        // System.out.println(list1);
        // Collections.sort(list1);
        // System.out.println(list1);

        // Decending order..
        Collections.sort(list1,Collections.reverseOrder());         // Comparator ->function logic of sorting
        System.out.println(list1);
    }
}
