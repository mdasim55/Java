class A extends Thread {      // When we write `extends Thread` this is not a ordinary class, It is also called Threads class  
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("I am cooking now.");
            System.out.println("I am sad sad.");
        }
    }
}
class B extends Thread {     // When we write `extends Thread` this is not a ordinary class, It is also called Threads class
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("I am chatting with her now.");
            System.out.println("I am so happy.");
        }
    }
}
class C extends Thread {     // When we write `extends Thread` this is not a ordinary class, It is also called Threads class
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("I am sleeping now."+i);
            System.out.println("I am not sad and not happy."+i);
        }
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        A obj1=new A();     // Obj1 is a threads object.
        B obj2=new B();     // Obj2 is a threads object.
        C obj3=new C();     // Obj2 is a threads object.

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        try {
            t1.start();
            t2.start();
            t3.start();
        } catch(Exception e) {
            System.out.println("Excdeption : "+e);
        }
        long endTime=System.currentTimeMillis();
        System.out.printf("Total time is taken: %d",(endTime-startTime));
    }
}