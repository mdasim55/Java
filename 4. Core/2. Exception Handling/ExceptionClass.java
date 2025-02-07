import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return "I am a toString";
    }
    public String getMessage() {
        return "I am a getMessage";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a=input.nextInt();
        if(a>10) {
            try {
                throw new MyException();
            } catch(Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished.");
            }
        }
        System.out.println("Yes, It is finished.");
        input.close();
    }
}