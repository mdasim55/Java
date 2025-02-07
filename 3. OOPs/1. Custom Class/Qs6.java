// 6.Create a class Tommy Vecetti for rockstar games capable of hitting(print hitting), running, fireing etc..

class Tommy {
    public void hitting() {
        System.out.println("Hitting the enemy.");
    }
    public void running() {
        System.out.println("Running from the enemy.");
    }
    public void fireing() {
        System.out.println("Fireing to the enemy.");
    }
}
public class Qs6 {
    public static void main(String[] args) {
        Tommy player=new Tommy();
        player.hitting();
        player.running();
        player.fireing();
    }
}
