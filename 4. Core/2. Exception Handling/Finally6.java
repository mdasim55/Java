public class Finally6 {
    public static int add(int a,int b) {
        try {
            int result=a/b;
            return result;
        } catch(Exception e) {
            System.out.println("Exception: "+e);
        } finally {
            System.out.println("I am a finally block.");
            System.out.println("The programme ends successfully.");
        }
        return -1;
    }
    public static void greet() {
        int a=5;
        int b=3;
        while(true) {
            try {
                int result=a/b;
                System.out.println(result);
            } catch(Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am a finally block.");
            }
            b--;
            System.out.println("The programme execiutes successfully.");
        }
    }
    public static void main(String[] args) {
        // int a=add(10, 2);
        // System.out.println("The devide value is: "+a);
        greet();
    }
}
// Finally block always execute.
