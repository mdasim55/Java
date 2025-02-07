 // Create a class cylinderand uuse getteers and setters to sets its radius and height to calculate surafce area 
 // and volumn of the cylinder.  

class cylinder1 {
    private int radius;
    private int height;
    public void setRadius(int r) {
        radius=r;
    }
    public void setHeight(int h) {
        height=h;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public double getSurface() {
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }
    public double getVolumn() {
        return Math.PI*radius*radius*height;
    }
}

public class Cylinder {
    public static void main(String[] args) {
        cylinder1 chong=new cylinder1();
        chong.setRadius(5);
        chong.setHeight(8);
        System.out.println(chong.getRadius());
        System.out.println(chong.getHeight());
        System.out.println("The total surface of the cylinder is: "+chong.getSurface());
        System.out.println("The area of the cylinder is: "+chong.getVolumn());
    }
}
