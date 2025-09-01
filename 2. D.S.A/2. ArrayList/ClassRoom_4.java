// 4. Find Maximum value in an ArrayList... 

import java.util.ArrayList;

public class ClassRoom_4 {
    public static void main(String[] Args) {
        // ClassName ObjName = new ClassName();                  // Create a Object
        ArrayList<Integer> list1 = new ArrayList<>();            // Create an integer ArrayList
        
        list1.add(5);             
        list1.add(8);             
        list1.add(3);             
        list1.add(9);             
        list1.add(2);
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list1.size()-1;i++) {
            // if(max < list1.get(i)) {
            //     max=list1.get(i);
            // }
            max=Math.max(max,list1.get(i));
        }
        System.out.println("Max element is: "+max);
    }
}
