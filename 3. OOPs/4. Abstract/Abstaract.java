abstract class Parent {
    public Parent() {
        System.out.println("I am a constractor of base class.");
    }
    public void sayHello() {
        System.out.println("Hello Wolrd!");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent {
    public void greet() {
        System.out.println("Good Morning");
    }
    public void greet2() {
        System.out.println("Good Night");
    }
}
abstract class Child2 extends Parent {
    public void th() {
        System.out.println("I am a good boy.");
    }
}
public class Abstaract {
    public static void main(String[] args) {
        //Parent obj=new Parent();            // It thorows error because it is abstract type
        Child obj= new Child();
        //Child2 obj= new Child2();           // It thorows error because it is abstract type
        obj.greet();
    }
}
