import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the bit number to be operation: ");
        int bit=sc.nextInt();
        System.out.print("Enter the index positin of the bit: ");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        System.out.print("Enter 1 for set the bit & 0 for clear the bit: ");
        int opBit=sc.nextInt();
        if(opBit==1) {
            int newNumber=bitMask | bit;
            System.out.println("the new number is: "+newNumber);
        } else {
            int notBitmask=~(bitMask);
            int newNumber=notBitmask & bit;
            System.out.println("The new number is: "+newNumber);
        }

    }
}
