// // 4.Create a class ractangle with a method to initilize its side, calculating area and parameter..

class Ractangle {
    int length;
    int breadth;
    public int calArea() {
        return length*breadth;
    }
    public int calParameter() {
        return 2*(length+breadth);
    }
}

public class Qs4 {
    public static void main(String[] args) {
        Ractangle rt=new Ractangle();
        rt.length=8;
        rt.breadth=5;
        System.out.println("The area of the square is: "+rt.calArea());
        System.out.println("The parameter of the square is: "+rt.calParameter());
    }
}

