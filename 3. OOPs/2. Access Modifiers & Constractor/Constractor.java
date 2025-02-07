class MyEmployee1 {
    private int id;
    private String name;

    /*public MyEmployee1() {
        id=2345;                            // For no arguments 
        name="CodeWithHarry";
    }*/
    public MyEmployee1(int id1,String n) {
        id=id1;                            // For arguments 
        name=n;
    }
    public void setId(int id1) {
        id = id1;
    }
    public int getId() {
        return id;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}

public class Constractor {
    public static void main(String[] args) {
        MyEmployee1 harry=new MyEmployee1(55,"Asim");        
        // harry.setId(45);
        // harry.setName("CodeWithhHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
