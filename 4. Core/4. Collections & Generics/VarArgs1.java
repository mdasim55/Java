// Variable Arguments
public class VarArgs1 {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        //System.out.println(sum());      // No arguments but it is excuted.
        System.out.println(sum(1,2,3));
    }
    // public static int sum(int... a) {
    //     int sum=0;
    //     for(int i: a) {
    //         sum+=i;
    //     }
    //     return sum;
    // }
    public static int sum(int first,int second,int... a) {
        int sum=first+second;
        for(int i: a) {
            sum+=i;
        }
        return sum;
    }
}