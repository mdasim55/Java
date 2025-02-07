// Create an interface flyable with an abstract method fly(). Create an abstract class Bird that implements flyable.
// Implement a sub-class Eagle that extends Bird. Provide an implementation for the fly() method.

interface Flyable {
    void fly();
}
abstract class Bird implements Flyable {
    private String breed;
    public Bird(String breed) {
        this.breed=breed;
    }
    public String getBreed() {
        return breed;
    }
}
class Eagle extends Bird {
    public Eagle() {
        super("Eagle");
    }
    public void fly() {
        System.out.println("Eagle can fly in the top of the sky.");
    }
}
public class Qs_84 {
    public static void main(String[] args) {
        Eagle obj=new Eagle();
        obj.fly();
    }
}
