// 85. In a class calculator, craete multiple add methods that overload each other and can sum 2 integers, 3 integhers,
//     or two doubles. Demonstrate how each can be called with differnt numbers of paramrter.  

class Calculator {
    public int add(int a,int b) {
        return a+b;
    }
    public int add(int a,int b,int c) {
        return a+b+c;
    }
    public double add(double a,double b) {
        return a+b;
    }
}
public class Qs_85 {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int a=calc.add(2,5);
        int b=calc.add(2,5,7);
        double c=calc.add(5.5,6.5);
        System.out.println("The sum is: "+a);
        System.out.println("The sum is: "+b);
        System.out.println("The sum is: "+c);
    }
}
