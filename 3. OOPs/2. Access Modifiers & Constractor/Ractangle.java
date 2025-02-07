// 4. Overload a constractor used to initilize a ractangle of length 4 and beradth 5 for using coustom parametre.

class Ractangle1 {
    private int length;
    private int breadth;
    public Ractangle1() {
        length=4;
        breadth=5;
    }    
    public Ractangle1(int l,int b) {
        length=l;
        breadth=b;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

public class Ractangle {
    public static void main(String[] args) {
        Ractangle1 ract=new Ractangle1(10,20);
        System.out.println("The length of the ractangle is:"+ract.getLength());
        System.out.println("The breadth of the ractangle is:"+ract.getBreadth());
    }
}


