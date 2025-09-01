// 3. Size of an ArrayList...

import java.util.ArrayList;

public class Classroom_3 {
    public static void main(String[] Args) {
        // ClassName ObjName = new ClassName();                  // Create a Object
        ArrayList<Integer> list1 = new ArrayList<>();            // Create an integer ArrayList
        ArrayList<String> list2 = new ArrayList<>();             // Create an String ArrayList
        ArrayList<Boolean> list3 = new ArrayList<>();            // Create an Boolean ArrayList
    
        list1.add(1);             
        list1.add(2);             
        list1.add(3);             
        list1.add(4);             
        list1.add(5);    
        System.out.println(list1.size());  
        
        // // print the ArrayList...
        // for(int i=0;i<list1.size();i++) {
        //     System.out.print(list1.get(i)+" ");
        // }
        // System.out.println();

        // print the Reverse ArrayList...
        for(int i=list1.size()-1;i>=0;i--) {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
    }
}
