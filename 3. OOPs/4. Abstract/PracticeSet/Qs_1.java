// 1. Create a abstract class pen with methods write() and refil() as abstract methods.
// 2. Use the Pen class from Q1 to create a concrete class Fpuntain pen with addtional methods changeNib().

abstract class Pen {
    abstract void write();
    abstract void refil();
}
class Fountain extends Pen {
    public void write() {
        System.out.println("This is used to write the of the page.");
    }
    public void refil() {
        System.out.println("Refil is the main  important part of the pen");
    }
    void changeNib() {
        System.out.println("Change the nib.");
    }
}
public class Qs_1 {
    public static void main(String[] args) {
        Fountain obj=new Fountain();
        obj.write();
        obj.refil();
        obj.changeNib();
    }
}