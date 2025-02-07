import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of buttom: ");
        int buttom=sc.nextInt();
        switch (buttom) {
            case 1: System.out.println("Hello");
                break;
            case 2: System.out.println("Nameste");
                break;
            case 3: System.out.println("Bhonjoor");
                break;
            default: System.out.println("You have entered invalid buttom.....");
                break;
        }
    }
}
