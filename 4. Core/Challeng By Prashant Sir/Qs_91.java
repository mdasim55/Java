// 91. Use the collections class to count the frequency of a particular element in an arrayList.
//     Frequency means number of count........
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Qs_91 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,4,7,9,45,3,1,4,5,9);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,4));
        System.out.println(Collections.frequency(list,9));
        System.out.println(Collections.frequency(list,45));
        System.out.println(Collections.frequency(list,99));
    }
}
