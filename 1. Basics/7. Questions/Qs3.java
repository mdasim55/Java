// 3. Write a funtion which takes in 3 numbers and returns the greater of those two....

import java.util.Scanner;

public class Qs3 {
    public static int calculateGreater(int a,int b,int c) {
        int greater;
        if(a>b && a>c) {
            greater=a;
        }
        else if(b>c) {
            greater=b;
        }
        else {
            greater=c;
        }
        return greater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, b and c : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int greater=calculateGreater(a, b, c);
        System.out.println("The greater between a, b and c is: "+greater);
    }
}
