// 3.Create a class circle with a method to initilize its radius, calculating area and parameter..

class Circle {
    int radius;
    public double calArea() {
        return 3.14*radius*radius;
    }
    public double calParameter() {
        return 2*3.14*radius;
    }
}

public class Qs5 {
    public static void main(String[] args) {
        Circle r=new Circle();
        r.radius=5;
        System.out.println("The area of the square is: "+r.calArea());
        System.out.println("The parameter of the square is: "+r.calParameter());
    }
}
