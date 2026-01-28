import java.util.HashMap;
// import java.util.Set;

public class H3_MejorityElement {
    public static void main(String[] args) {
        // int arr[] = {1,3,2,5,1,3,1,5,1};
        int arr[] = {1,2};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int num = arr[i];
            // if(map.containsKey(num)) {
            //     map.put(num, map.get(num)+1);
            // } else {
            //     map.put(num, 1);
            // }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // Set<Integer> keySet = map.keySet();
        // for(Integer key : keySet) {
        //     if(map.get(key) > n/3) {
        //         System.out.print(key+" ");
        //     } 
        // }
        for(Integer key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.print(key+" ");
            } 
        }
        System.out.println();
    }   
}
