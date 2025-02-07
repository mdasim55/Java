// 92. Write a methods that swaps two elemnts in an arrayList, given the indices.

import java.util.List;
import java.util.Arrays;

public class Qs_92 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        swap(list,2,5);
        System.out.println(list);
    }
    public static void swap(List<Integer> list,int i,int j) {
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}
