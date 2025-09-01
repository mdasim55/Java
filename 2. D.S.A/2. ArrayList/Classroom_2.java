// 2. Operation on an ArrayList....

import java.util.ArrayList;

public class Classroom_2 {
    public static void main(String[] Args) {
        // ClassName ObjName = new ClassName();                  // Create a Object
        ArrayList<Integer> list1 = new ArrayList<>();            // Create an integer ArrayList
        ArrayList<String> list2 = new ArrayList<>();             // Create an String ArrayList
        ArrayList<Boolean> list3 = new ArrayList<>();            // Create an Boolean ArrayList

        // 1. Add Operation..       Time Complexity
        list1.add(1);             //    O(1)
        list1.add(2);             //    O(1)
        list1.add(3);             //    O(1)
        list1.add(4);             //    O(1)
        list1.add(5);             //    O(1)
        System.out.println(list1); 

        list1.add(1,9);     //  O(1)
        System.out.println(list1);

        // 2. Get Operation...            O(1)
        int element=list1.get(2);
        int element2=list1.get(4);
        System.err.println(element);
        System.err.println(element2); 

        // 3. Delete Operation...         O(n)
        list1.remove(2);
        System.out.println(list1);

        // 4. Set Element at Index...     O(n)
        list1.set(0,6);         // list1.set(index,value)
        System.out.println(list1);

        // 5. Contains Element...         O(1)
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(6));
    }
}
