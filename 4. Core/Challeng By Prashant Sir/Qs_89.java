// 89. Write a method concatenate String that takes variable arguments of String type and concatenates them into a
//     single String.

public class Qs_89 {
    public static String add(String... elements) {
        StringBuilder sb=new StringBuilder();
        for(String str: elements) {
            sb.append(str).append("  ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str=add("Ram","Sam");
        System.out.println(str); 
        str=add("Ram","Sam","Rajibul","Ajijul","Jamirul","Rakesh","Rohit");
        System.out.println(str); 
    }
}
