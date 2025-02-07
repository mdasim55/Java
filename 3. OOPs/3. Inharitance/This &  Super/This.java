class EkClass {
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a) {
        this.a=a;               // This is the this keywoard.
    }
    public int return1() {
        return 1;
    } 
}
class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("I am a DoClass Constractor");
        System.out.println("The value of c is: "+c);
    }
}
public class This {
    public static void main(String[] args) {
        EkClass e=new EkClass(55);
        DoClass d=new DoClass(56);
        System.out.println(e.getA());
    }   
}
