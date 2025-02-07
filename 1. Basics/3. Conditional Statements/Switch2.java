import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Dy of the calculator:---> ");
        System.out.print("Enter days in number: ");
        int day=input.nextInt();
        //newSwitch(day);
        OldSwitch(day);
    }
    public static void newSwitch(int day) {
        String dayStr = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid Day";
        };
        System.out.println(dayStr);
    }
    public static void OldSwitch(int day) {
        switch (day) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thrusday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6:
            case 7: 
                System.out.println("Holiday");
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
