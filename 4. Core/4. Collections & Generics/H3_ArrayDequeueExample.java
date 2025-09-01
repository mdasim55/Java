import java.util.*;

public class H3_ArrayDequeueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        
        // Add the element in the ArryDequeue...
        ad1.add(6);     
        ad1.add(17);
        ad1.add(26);     
        ad1.add(37);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}