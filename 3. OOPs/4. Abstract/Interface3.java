interface sampleInterface {
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface {
    void math3();
    void math4();
}
class SampleClass implements childSampleInterface {
    public void math1() {
        System.out.println("This is a math1 function.");
    }
    public void math2() {
        System.out.println("This is a math2 function.");
    }
    public void math3() {
        System.out.println("This is a math3 function.");
    }
    public void math4() {
        System.out.println("This is a math4 function.");
    }
} 
public class Interface3 {
    public static void main(String[] args) {
        SampleClass obj=new SampleClass();
        obj.math1();
        obj.math2();
        obj.math3();
        obj.math4();
    }
}
