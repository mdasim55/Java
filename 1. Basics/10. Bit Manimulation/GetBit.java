import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the bit number to be operation: ");
        int bit=sc.nextInt();
        System.out.print("Enter the index positin of the bit: ");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if((bitMask & bit)==0) {
            System.out.println("The given bit was 0.");
        } else {
            System.out.println("The given bit was 1.");
        }
        sc.close();
    }
}