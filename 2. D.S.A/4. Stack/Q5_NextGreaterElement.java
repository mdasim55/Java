// Find the next greater elemnt in an array....

import java.util.Arrays;
import java.util.Stack;

public class Q5_NextGreaterElement {
    // Types of print 1-D array.....

    // Type 1: Using toString...
    public static void printArray1(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    // Type 2: Using for loop...
    public static void printArray2(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    // Type 3:  Using an enhanced for-each loop
    public static void printArray3(int arr[]) {
        for(int num: arr) {
            System.out.println(num);
        }
    } 
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--) {
            // 1> while loop..
            while(! s.isEmpty() && arr[i]>=s.peek()) {
                s.pop();
            }
            // 2> If-Else condition...
            if(s.isEmpty()) {
                nextGreater[i]=-1;
            } else {
                nextGreater[i]=s.peek();
            }
            // 3. Push the element in the stack...
            s.push(arr[i]);
        }
        printArray1(nextGreater);
        printArray1(nextGreater);
        printArray1(nextGreater);

    }
}


// The questions may be...
//     1. Find left greater number
//     2. Find right greater number
//     3. Find left smaller number
//     4. Find right smaller number