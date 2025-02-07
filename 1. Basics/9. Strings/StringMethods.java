public class StringMethods {
    public static void main(String[] args) {
        // Concatenation
        String firstName="Tony";
        String lastName="Stark";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        // charAt 
        for(int i=0;i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        }

        // Compare 
        String name1="Tony";
        String name2="Tony";
        if(name1.compareTo(name2)==0) {
            System.out.println("The given two strings is equal");
        }
        else {
            System.out.println("The given two strings is not equal");
        }

        // Print Sub- string.....
        String sentance="My name is Asim";
        //  Substing(beg index, end index)...
        String name = sentance.substring(11,sentance.length());
        System.out.println(name);
    }
}