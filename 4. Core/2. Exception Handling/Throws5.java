// Throw and Throws keyword

class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius cannot be negative.";
    }
    public String getMessage() {
        return "Radius cannot be negative.";
    }
} 
public class Throws5 {
    public static double area(int r) throws NegativeRadiusException {
        if(r<0) {
            throw new NegativeRadiusException();
        }
        double area=Math.PI*r*r;
        return area;
    }
    public static int add(int a, int b) throws ArithmeticException{
        int result=a/b;
        return result;
    } 
    public static void main(String[] args) {
        // try {
        //     int c=add(6,0);
        //     System.out.println("The sum is: "+c);
        // } catch (Exception e) {
        //     System.out.println("Here any exception is occured.");
        // }
        try {
            double ar=area(-2);
            System.out.println("The area is: "+ar);
        } catch (Exception e) {
            System.out.println("Here any exception is occured.");
        }
    }
}
