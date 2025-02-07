class Base1 {
    public Base1() {
        System.out.println("I am a base class constructor.");
    }
    public Base1(int x) {
        System.out.println("I am a overloaded constructor in the base class with the vlue of x as: ");
    }
}
class Derived1 extends Base1 {
    Derived1() {
        //super(7);
        System.out.println("I am a derived class constructor.");
    }
    Derived1(int x,int y) {
        super(y);
        System.out.println("I am a overloaded constructor in the derived class with the vlue of x & y as:");
    }
}
class childofDerived extends Derived1 {
    public childofDerived()  {
        System.out.println("I am a child of derived class.");
    }
    public childofDerived(int x,int y,int z)  {
        super(x,y);
        System.out.println("I am a child of derived class.");
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Base1 b=new Base1(1);
        // Derived1 d=new Derived1();
        childofDerived cd=new childofDerived(1,2,3);

    }
}
