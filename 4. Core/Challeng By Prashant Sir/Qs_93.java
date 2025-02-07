// 93. Create a program that reverse the element of a list and print the reverse list.  

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Qs_93 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }   
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }
    public static void reverse2(List<Integer> list) {
        for(int i=0;i<list.size()/2;i++) {
            ListSwapping.swap(list,i,list.size()-1-i);
        }
    }
}
