 // Create a class cylinderand uuse getteers and setters to sets its radius and height to calculate surafce area and volumn of the cylinder.  
//  Solved same question using constractor 
 class Cylinder3 {
    private int radius;
    private int height;
    public Cylinder3(int r,int h) {
        radius=r;
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

public class Cylinder2 {
    public static void main(String[] args) {
        Cylinder3 chong=new Cylinder3(5,8);
        System.out.println("The radius of the cylinder is:"+chong.getRadius());
        System.out.println("The height of the cylinder is:"+chong.getHeight());
        System.out.println("The total surface of the cylinder is: "+chong.getSurface());
        System.out.println("The area of the cylinder is: "+chong.getVolumn());
    }
}

