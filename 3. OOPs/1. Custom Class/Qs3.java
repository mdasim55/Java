// 3.Create a class square with a method to initilize its side, calculating area and parameter..

class Square {
    int side;
    public int calArea() {
        return side*side;
    }
    public int calParameter() {
        return 4*side;
    }
}

public class Qs3 {
    public static void main(String[] args) {
        Square sq=new Square();
        sq.side=5;
        System.out.println("The area of the square is: "+sq.calArea());
        System.out.println("The parameter of the square is: "+sq.calParameter());
    }
}
