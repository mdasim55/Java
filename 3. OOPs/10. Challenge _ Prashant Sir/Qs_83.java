// Create a abstarct class shape with an abstract method claculateArea(). Implement two sub-class: Circle and Square.
// Each sub-class should have relevent attributes (like radius for Circle, side for square) and their own 
// implementation of the calculateArea() method.  

abstract class Shape {
    public abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getRadius(double radius) {
        return radius;
    }
    public double calculateArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }
}
class Square extends Shape {
    private int side;
    public void setSide(int side) {
        this.side=side;
    }
    public int getSide(int side) {
        return side;
    }
    public double calculateArea() {
        return Math.pow(side,2);
    }
}

public class Qs_83 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Square obj2 = new Square();
        obj1.setRadius(5.5);
        obj2.setSide(5);
        System.out.println("The area of the circle is: "+obj1.calculateArea());
        System.out.println("The area of the circle is: "+obj2.calculateArea());
    }    
}
