/* What is the order of constractor executing for the follwing inheritance hierachy .          
            Order: Base-> Derived-> Derived 2
  Derived2 obj=new Derived2();
//   Which constructor will be executed & in what order ?
*/

class Base {
    Base() {
        System.out.println("I am a Base class constructor.");
    }
}
class Derived extends Base {
    Derived() {
        System.out.println("I am a Derived class constructor.");
    }
}
class Derived2 extends Derived {
    Derived2() {
        System.out.println("I am a Derived2 class constructor.");
    }
}
public class Qs2 {
    public static void main(String[] args) {
        Derived2 obj=new Derived2();
    }
}
