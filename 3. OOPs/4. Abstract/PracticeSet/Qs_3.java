// 3. Create a class monkey with jump() and bite() methods. Create a class Human which inharite the Monkey  class 
//    and implements BasicAnimal interface with eat() and sleep() methods.
// 5. Demontrate polymorphism using monkey class from Qs3.

class Monkey {
    public void jump() {
        System.out.println("Money can be jump.");
    }
    public void bite() {
        System.out.println("Money can be bite");
    }
}
interface BasicAnimal {
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal {
    public void speak() {
        System.out.println("Hello sir...Hello sir.....");
    }
    public void eat() {
        System.out.println("Human can be eaten");
    }
    public void sleep() {
        System.out.println("Human needs to sleep");
    }
}

public class Qs_3 {
    public static void main(String[] args) {
        Human obj=new Human();    
        Monkey obj2=new Human();
        obj.jump();
        obj.bite();
        obj.speak();
        obj.eat();
        obj.sleep();

        obj2.jump();          // It can possible...
        obj2.bite();          //  It can possible...
        //obj2.speak();       // It can`t be access...because the reference is monkey which doesn`t have speak() method.
        //obj2.eat();         // It can`t be access...because the reference is monkey which doesn`t have eat() method.
        //obj2.sleep();       // It can`t be access...because the reference is monkey which doesn`t have sleep() method.
    }
}
