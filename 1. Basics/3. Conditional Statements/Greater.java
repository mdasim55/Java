import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of a: ");
        int b=sc.nextInt();
        if(a==b) {
            System.out.println("Equal");
        }
        else {
            if(a>b) {
                System.out.println("a isGreater");
            }
            else {
                System.out.println("a is Less");
            }
        }
    }
}
