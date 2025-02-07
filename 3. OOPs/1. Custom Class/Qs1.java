// 1.Create a class Employee with following properties and methods: 
//      -> salary (Property) (int)
//      -> getSalary (Method returning int)
//      -> name (Property) (String)
//      -> getName (method returning String)
//      -> setName (method changing String)

class Employee1 {
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class Qs1 {
    public static void main(String[] args) {
        Employee1 harry=new Employee1();
        harry.salary=50000;
        harry.setName("ViratKohli");
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
    } 
}
