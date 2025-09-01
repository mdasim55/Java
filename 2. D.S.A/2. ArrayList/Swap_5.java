// 5. Swap two Numbers in an ArrayList...

import java.util.ArrayList;

public class Swap_5 {
    public static void Swap(ArrayList<Integer> list1,int indx1,int indx2) {
        int temp=list1.get(indx1);
        list1.set(indx1,list1.get(indx2));
        list1.set(indx2,temp);
    }
    public static void main(String[] Args) {
        // ClassName ObjName = new ClassName();                  // Create a Object
        ArrayList<Integer> list1 = new ArrayList<>();            // Create an integer ArrayList
    
        list1.add(1);             
        list1.add(2);             
        list1.add(3);             
        list1.add(4);             
        list1.add(5);    

        int indx1=2;
        int indx2=4;
        System.out.println(list1);      // ArrayList before Swap
        Swap(list1,indx1,indx2);
        System.out.println(list1);      // ArrayList After Swap

    }
}
