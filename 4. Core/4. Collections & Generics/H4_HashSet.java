import java.util.HashSet;

public class H4_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(6);

        // Add the elemnts in the hashSet...
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(55);
        hs.add(55);
        System.out.println(hs);
    }
}
