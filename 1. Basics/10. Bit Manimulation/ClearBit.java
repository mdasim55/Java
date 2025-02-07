import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the bit number to be operation: ");
        int bit=sc.nextInt();
        System.out.print("Enter the index positin of the bit: ");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int notBitmask=~(bitMask);
        int newNumber=notBitmask & bit;
        System.out.println("The new number is: "+newNumber);
    }
}
