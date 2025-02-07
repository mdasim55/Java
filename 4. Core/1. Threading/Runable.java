class Runnable1 implements Runnable {
    public final char targetChar;
    public Runnable1(char targetChar) {
        this.targetChar=targetChar;
    }
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.printf("%d%c",i,targetChar);
        }
        System.out.printf("\n%s %c task has completed.",Thread.currentThread().getName(),targetChar);
    }
}
public class Runable {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        Runnable1 bullet1 = new Runnable1('*');
        Runnable1 bullet2 = new Runnable1('$');
        Runnable1 bullet3 = new Runnable1('#');

        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        Thread gun3=new Thread(bullet3);

        gun1.start();
        gun2.start();
        gun3.start();

        try {
            gun1.join();
            gun2.join();
            gun3.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        long endTime=System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",Thread.currentThread().getName(),(endTime-startTime));
    }
}
