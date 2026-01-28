import java.util.HashSet;

public class H6_UnionnIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        for(int num : arr1) {
            set.add(num);
        }
        for(int num : arr2) {
            set.add(num);
        }
        System.out.println("The union of the 2 sets is: "+set.size());
        // For intersection...
        int count = 0;
        set.clear();
        for(int num : arr1) {
            set.add(num);
        }
        for(int num : arr2) {
            if(set.contains(num)) {
                count++;
                set.remove(num);
            }
        }
        System.out.println("The intersection of the 2 sets is: "+ count);
    }    
}
