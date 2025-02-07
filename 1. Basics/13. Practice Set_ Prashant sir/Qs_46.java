// 46. Create a program to check is the array is palindrome or not.

public class Qs_46 {
    public static void main(String[] args) {
        System.out.println("Check the Array is palindrome or not:.....");
        int[] arr=ArrayUtility.inputArray();
        boolean isPalindrome=isPalindrome(arr);
        if(isPalindrome) {
            System.out.println("The given array is Palindrome.");
        } else {
            System.out.println("The given array is not Palindrome.");
        }
    }
    public static boolean isPalindrome(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            // System.out.println("The value of i is : "+i);            // For checking debugging.
            int copyNum=arr[i];
            int reverse=0;
            while(copyNum>0) {
                int digit=copyNum%10;
                reverse=reverse*10+digit;
                copyNum=copyNum/10;
            }
            if(reverse!=arr[i]) {
                return false;
            }
        }
        return true;
    }     
}
