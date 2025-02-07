public class Wrapper2 {         // Wrapper are immutable.
    public static void main(String[] args) {
        //Integer first=new Integer(55);            // It is the main type to create wrapper objects.
        Integer first=55;        // AutoBoxing   // It also be possible because java can be type conversing.
        System.out.println(first);
        int second=first;       // Unboxing
        System.out.println(second);
        // Autoboxing: -> Automatic conversion of primitive types to their corresponding wrapper class object.
        // Unboxing: -> Automatic conversion of wrapper class object back to their respective primitive types.

        // For boolean Value
        boolean b=true;
        Boolean b1=new Boolean(b);
        System.out.println(b);
        System.out.println("Boolean Object: "+b1);
        String str="false";
        b1=new Boolean("False");
        System.out.println(str);
        System.out.println("Boolean Object: "+b1);
        System.out.println("Boolean object to primitive value --> "+b1.booleanValue());
        

        // For integer value
        String s="10";
        Integer n1=new Integer(s);
        System.out.println(n1);
        s="ten";
        Integer n2=new Integer(s);
        System.out.println(n1);
    }
}