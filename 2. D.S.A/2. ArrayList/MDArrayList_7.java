// 7. Multi-Dimentional ArrayList...

import java.util.ArrayList;

public class MDArrayList_7 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainlist.add(list1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        mainlist.add(list2);

        // Print the list elements....
        for(int i=0;i<mainlist.size();i++) {
            ArrayList<Integer> currentList= mainlist.get(i);
            for(int j=0;j<currentList.size();j++) {
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);           // Print the mainlist


        // Add the elements in the single List.....
        // list1: 1 2 3 4 5 
        // list2: 2 4 6 8 10
        // list3: 3 6 9 12 15

        ArrayList<ArrayList<Integer>> mainList2=new ArrayList<>();
        ArrayList<Integer> list11=new ArrayList<>();
        ArrayList<Integer> list12=new ArrayList<>();
        ArrayList<Integer> list13=new ArrayList<>();

        for(int i=1;i<=5;i++) {
            list11.add(i*1);
            list12.add(i*2);
            list13.add(i*3);
        }
        mainList2.add(list11);
        mainList2.add(list12);
        mainList2.add(list13);
        System.out.println(mainList2);
    }
}
