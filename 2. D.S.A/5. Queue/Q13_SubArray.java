// Question 5 :
//  Maximum of all subarrays of size k : 

//  We have an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.
 
//  Sample Input 1 : N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
//  Sample Output 1 : 3 3 4 5 5 5 6

import java.util.LinkedList;
import java.util.Queue;

public class Q13_SubArray {
    public static void Reversearray(Queue<Integer> q,int k) {
        Queue<Integer> q2 =new LinkedList<>();
        int max=0;
        for(int i=0;i<k;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        } 
        q2.push(max);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
    }
} 