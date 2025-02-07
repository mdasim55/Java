// 86. Define a base class Vehicle with a method service() and a sub-class Car, that overrides service(),
//     provide a specific implementation that calls 'super.service' as well to shoe hoe overrides works. 

class Vehicle {
    public void service() {
        System.out.println("Here, vehicle is getting services.");
    }
}
class Car extends Vehicle {
    public void service() {
        super.service();
        System.out.println("Here, CAr is getting services.");
    }
}
public class Qs_86 {
    public static void main(String[] args) {
        Vehicle obj1=new Vehicle();
        Car obj2=new Car();
        obj1.service();
        obj2.service();
    }
}
