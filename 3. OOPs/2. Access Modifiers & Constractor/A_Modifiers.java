class MyEmployee {
    private int id;
    private String name;

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

public class A_Modifiers {
    public static void main(String[] args) {
        MyEmployee harry=new MyEmployee();
        // harry.id=45;
        // harry.name="CodeWithHarry";              --> Throws an error due to private modifiers.
        
        harry.setId(45);
        harry.setName("CodeWithhHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}