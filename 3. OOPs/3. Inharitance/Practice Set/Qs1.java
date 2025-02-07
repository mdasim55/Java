// Crate a clas Circle and use inheritance to create another class Cylinder from it.   
class Circle {
    public int radius;
    Circle() {
        System.out.println("I am a non-parameter constractor");
    }
    Circle(int r) {
        System.out.println("I am a circle parameter constractor");
        this.radius=r;
    }
    public double Area() {
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle {
    public int height;
    Cylinder(int r,int h) {
        super(r);
        this.height=h;
        System.out.println("I am a cylinder parameter constractor");
    }
    public double volume() {
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Qs1 {
    public static void main(String[] args) {
        Circle obj1=new Circle(5);
        System.out.println(obj1.Area());
        Cylinder obj2=new Cylinder(5,6);
        System.out.println(obj2.volume());
        System.out.println(obj2.Area());
    }
}
