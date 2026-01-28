import java.util.HashSet;

public class H5_CountDistinctElements {

    public static int countDisElement(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        int diselement = countDisElement(arr);
        System.out.println(diselement);
    }
}
