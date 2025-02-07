// print the table of a numbers input by the user......

import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the table of a number: ");
        int n=st.nextInt();
        int mul;
        for(int i=1;i<=10;i++) {
            mul=n*i;
            System.out.println(n+"*"+i+" = "+mul);
            System.out.println(n+"*"+i+" = "+n*i);
        }
    }
}
