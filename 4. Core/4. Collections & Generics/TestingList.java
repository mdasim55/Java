import java.util.ArrayList;

public class TestingList {
    public static void main(String[] args) {
        ArrayList<String> strList=new ArrayList<>();
        
        // Add element in thr list.....
        strList.add("Prashant.");
        strList.add("prosenjit.");
        strList.add("Partho.");
        strList.add(1,"Pradip.");           // Add in the middle.
        // strList.add(554);                              // Now its not a possible because it is a String List.
        
        for(int i=0;i<strList.size();i++) {
            System.out.println(strList.get(i));
        }
        System.out.println();
        // Remove element in the List
        strList.remove(0);
        for(String str:strList) {
            System.out.println(str);
        }

        // Contains:- If elemnet is exits or not..
        if(strList.contains("Partho.")) {
            System.out.println("Partho is exits in the list.");
            System.out.println(strList.indexOf("Partho."));
        } else {
            System.out.println("Partho does not exits in the list.");
        }
    }
}
