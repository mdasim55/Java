import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int numbers[]=new int[size];                   // Initialize all the value with 0 in java
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++) {
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            System.out.println(numbers[i]);      
        }
    }
}
