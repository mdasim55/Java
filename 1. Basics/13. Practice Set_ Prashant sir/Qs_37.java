// 37. Create a program to check if a given number is Armstrong or not.
//    Armstrong number:-> 0, 1, 153, 370, 371, 407, ...., 1634, ....

import java.util.Scanner;

public class Qs_37 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong calculator...");
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        boolean isArmstrong=isArmstrong(num);
        //System.out.println(isArmstrong(num));             // For the use of debugging
        if(isArmstrong) {
            System.out.println(num+" is a Armstrong number.");
        } else {
            System.out.println(num+" is not a Armstrong number.");
        }
    }
    public static boolean isArmstrong(int num) {
        int numCopy=num;
        int count=noOfDigit(numCopy);
        //System.out.println("The count is: "+count);        //  For the use of debugging
        int finalNum=0;
        while(numCopy>0) {
            int lastDigit=numCopy%10;
            numCopy/=10;
            finalNum+=pow(lastDigit,count);
            //System.out.println("The final number is: "+finalNum);         // For the use of debugging
        }
        if(finalNum==num) {
            return true;
        } else {
            return false;
        }
    }
    public static int noOfDigit(int num) {
        int count=0;
        while(num>0) {
            num/=10;
            count++;
        }
        return count;
    }
    public static int pow(int n,int count) {
        int result=1;
        for(int i=0;i<count;i++) {
            result*=n;
        }
        //System.out.println("The power is: "+result);              // For the use of debugging
        return result;
    }  
}
