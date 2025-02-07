import java.util.Set;
import java.util.HashSet;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        System.out.println(names.add("Ram."));
        System.out.println(names.add("Sam."));
        System.out.println(names.add("Mam."));
        Utility.print(names);
        // Check 
        System.out.println();
        System.out.println(names.add("Ram."));
        System.out.println(names.size());
        Utility.print(names);

        // Removes element..
        System.out.println(names.contains("Ram."));
        System.out.println(names.remove("Ram."));
        Utility.print(names);


        System.out.println(names.remove("Ram."));
        System.out.println(names.size());
        Utility.print(names);
    }
}
