import java.util.Scanner;

public class Declaration {
    public static void main(String[] args) {
        // String Declaration
        String name="Tony";
        String name1="Tony Stark";
        String name2="Tony Strak is the Iron Man";

        // User Input as a single word 
        Scanner sc=new Scanner(System.in);
        // String name3=sc.next();
        // System.out.println(name3);

        // User Input as a single word 
        String name4=sc.nextLine();
        System.out.println(name4);
    }
}