// 9. Find if any pair in a sorted ArrayList has a target Sum...
// list = [1,2,3,4,5,6]     target=5

import java.util.ArrayList;

public class PairSum_9 {
    // // Brute Force --> Checks all possible outcomes...
    // // Time Complexity - O(n^2)
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    //     for(int i=0;i<list.size();i++) {
    //         for(int j=i+1;j<list.size();j++) {
    //             if(list.get(i)+list.get(j)==target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Linear Approach ---> Time Complexity:- O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp) {
            // Case 1
            if(list.get(lp)+list.get(rp)==target) {
                return true;
            }
            // Case 2
            else if(list.get(lp)+list.get(rp)>target) {
                rp--;
            }
            // Case 3
            else {
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // = [1,2,3,4,5,6]
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;

        // System.out.println(pairSum1(list,target));
        System.out.println(pairSum2(list,target));
    }
}
