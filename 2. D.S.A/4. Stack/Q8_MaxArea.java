// Claculate max area in Histogram...

import java.util.Arrays;
import java.util.Stack;

public class Q8_MaxArea {

    public static void maxArea(int arr[]) {                 // Time Complexity: 3*O(n)  -> O(n)
        int maxArea = 0;
        int nls[] = new int[arr.length];
        int nrs[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        // Calculate next left smaller elements...
        for(int i=0;i<arr.length;i++) {             // Time Complexity: O(n)
            while((!s.isEmpty()) && ( arr[s.peek()]>=arr[i])) {
                s.pop();
            }
            if(s.isEmpty()) {
                nls[i]=-1;
            } else {
                nls[i]=s.peek();
            }
            s.push(i);
        }
        // Free the Stack
        s = new Stack<>();
        // Calculate next right smaller elements...
        for(int i=arr.length-1;i>=0;i--) {              // Time Complexity: O(n)
            while((!s.isEmpty()) && ( arr[s.peek()]>=arr[i])) {
                s.pop();
            }
            if(s.isEmpty()) {
                nrs[i]=arr.length;
            } else {
                nrs[i]=s.peek();
            }
            s.push(i);
        }
        // Calculate current Area...Width=j-i-1  -> arr[nrs]-arr[nls]-1
        for(int i=0;i<arr.length;i++) {                 // Time Complexity: O(n)
            int height = arr[i];
            int width = nrs[i]-nls[i]-1;
            int area = height*width;
            maxArea= Math.max(area,maxArea);
        }
        System.out.println("The maximum area is: "+ maxArea);
    }
    public static void printArray1(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        maxArea(height);
        
    }
}
