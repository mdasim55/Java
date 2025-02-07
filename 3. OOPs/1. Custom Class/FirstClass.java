class Employee  {
   int id;
   int salary;
   String name;
   int mSalary;
   public void printDetails() {
      System.out.println("My id is: "+id);
      System.out.println("My name is: "+name);
      System.out.println("My Salary is: "+salary);
   }
   public int getSalary() {
      return mSalary;
   }

}

public class FirstClass {
   public static void main(String[] args) {
      Employee object=new Employee();              // Creat a new employee Object
      Employee harry=new Employee();              // Creat a new employee object
      
      // Setting Attributes for object .......
      object.id=25;
      object.salary=25000;
      object.name="MD Korim";
      object.mSalary=500000;

      // Setting Attributes for object .......
      harry.id=35;
      harry.salary=35000;
      harry.name="MD Rorim";

      object.printDetails();
      harry.printDetails();

      int salary=object.getSalary();
      System.out.println("The monthly salary is: "+salary);
   } 
}