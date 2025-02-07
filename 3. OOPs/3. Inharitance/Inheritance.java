class Base {
    int x;
    public void setX(int val) {
        x=val;
    }
    public int getX() {
        System.out.println("I am a constractor in a base class");
        return x;
    }
}
class Derived extends Base {
    int y;
    public void setY(int val) {
        y=val;
    }
    public int getY() {
        System.out.println("I am a constractor in a derived class");
        return y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // create an objects on a base class
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());
        
        // create an objects on a base class
        Derived d=new Derived();
        d.setX(44);
        System.out.println(d.getX());
        d.setY(54);
        System.out.println(d.getY());                     
        
        
    }
}