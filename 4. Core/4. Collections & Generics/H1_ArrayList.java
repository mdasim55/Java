import java.util.*;

public class H1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        
        // Add elements in the ArrayList....
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(0,5);
        l1.add(0,5);
        l1.add(3,5);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        // Add two ArayList...
        l1.addAll(l2);
        // l1.addAll(0,l2);
        // l1.addAll(3,l2);

        // Delete the ArrayList..
        //l1.clear();

        // Check the elements is stay or not in the ArrayList...
        System.out.println(l1.contains(5)); 
        System.out.println(l1.contains(55));
        // Returns the index of the element...
        System.out.println(l1.indexOf(5)); 
        System.out.println(l1.indexOf(15)); 
        System.out.println(l1.indexOf(150));
        
        // Change the elements...
        l1.set(0,55);

        // Print the ArrayList..
        for(int i=0;i<l1.size();i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

        System.out.println(l1);
        System.out.println(l1.get(5));
    }    
}
