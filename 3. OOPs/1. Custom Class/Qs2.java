// 2.Create a class cellPhone with methods to print "ringing","Vibrating"," Silent" etc....

class Cellphone {
    public void ring() {
        System.out.println("Ringging...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void slient () {
        System.out.println("Scilient...");
    }
    public void callFriend() {
        System.out.println("Calliing Friend...");
    }
}

public class Qs2 {
    public static void main(String[] args) {
       Cellphone vivo = new Cellphone();
        vivo.ring();
        vivo.vibrate();
        vivo.slient();
        vivo.callFriend();
    }
}
