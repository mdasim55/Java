// 90. Write a program that sorts a list of  String objects in descending order using a coustom comparator.   

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Qs_90 {
    public static void sortDescending(List<String> strList) {
        //Collections.sort(strList);
        //Collections.reverse(strList);
        // Coustom Comparator...
        Collections.sort(strList, new java.util.Comparator<String>() {
            public int compare (String s, String t1) {
                if(s.equals(t1)) {
                    return 0;
                } else if(s.charAt(0)>t1.charAt(0)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Lion","Zebra","Monkey","Elephant","Ant");
        System.out.println(list);
        sortDescending(list);
        System.out.println(list);
    }
}
