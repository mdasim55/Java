 interface Bycycle {
    int a=55;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface Horn {
    int b=55;
    void blowHorn1();
    void blowHorn2();
}
class ACycle implements Bycycle, Horn {
    void horn() {
        System.out.println("Horn......huuuuuuuuuuuuuuuuuuuuuuu");
    }
    public void applyBreak(int decrement) {
        System.out.println("Here, Break is applying.");
    }
    public void speedUp(int increment) {
        System.out.println("Here, Sped is applying");
    }
    public void blowHorn1() {
        System.out.println("Horn --> Mohabatain");
    };
    public void blowHorn2() {
        System.out.println("Horn --> DDLJ");
    };
}
public class Interface {
    public static void main(String[] args) {
        ACycle obj=new ACycle();
        // You can creare propertiesin interfaces
        System.out.println(obj.a);
        // You can not modify the properties in inteface as they are final..
        // obj.a=45;                // it gives error...
        obj.speedUp(5);              
        obj.applyBreak(0);
        obj.blowHorn1();
        obj.blowHorn2();
    }
}
