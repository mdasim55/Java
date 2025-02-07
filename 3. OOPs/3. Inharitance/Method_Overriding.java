class Overriding {
    public int a;
    public int something() {
        return 5;
    }
    public void method2() {
        System.out.println("I am a method1 of base class");
    }
}
class Overriding1 extends Overriding {
    public void method2() {
        System.out.println("I am a method3 of derived class");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Overriding obj1=new Overriding();
        obj1.method2();
        Overriding1 obj2=new Overriding1();
        obj2.method2();
    }
}
