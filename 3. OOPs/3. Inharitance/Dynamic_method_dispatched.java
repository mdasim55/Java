class phone {
    public void name() {
        System.out.println("My name is java in base class");
    }
    public void greet() {
        System.out.println("Hello, Good morning");
    }
}
class smartPhpne extends phone {
    public void name() {
        System.out.println("My name is java in derived class");
    }
    public void welcome() {
        System.out.println("Welcome here...");
    }
}
public class Dynamic_method_dispatched {
    public static void main(String[] args) {
        // phone obj=new phone();
        // obj.name();
        phone obj=new smartPhpne();             // It is allowed in java 
        // smartPhpne obj=new phone();             // It is not allowed because it is a wrong syntax
        obj.greet();
        //obj.welcome();
        obj.name();
    }
}
