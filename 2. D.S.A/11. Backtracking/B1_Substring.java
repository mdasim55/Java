public class B1_Substring {
    public static void subString(String str, String result, int i) {
        if(i==str.length()) {
            System.out.println(result);
            return;
        }
        // When choice is Yes
        subString(str,result+str.charAt(i),i+1);
        // When choice is No
        subString(str,result,i+1);
    }
    public static void main(String[] args) {
        
        String str ="abc";
        String result = "";
        subString(str, result, 0);
    }
}