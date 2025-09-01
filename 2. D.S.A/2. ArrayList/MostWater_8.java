// 8. Conatiner with most water using brute force...& Linear Approach

import java.util.ArrayList;

public class MostWater_8 {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater=0;
        // Brute Force... Time Complexity- O(n^2)
        for(int i=0;i<height.size();i++) {
            for(int j=i+1;i<height.size();j++) {
                int ht=Math.min(height.get(i), height.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    // Linear Search ... Time Complexity-> O(n)
    public static int storeWater1(ArrayList<Integer> list) {
        int maxWater=0;
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp) {
            // Calculate water area...
            int ht=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);
            // Update pointer
            if(list.get(lp)<list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // System.out.println(storeWater(height));
        System.out.println(storeWater1(height));
    }
    
}
