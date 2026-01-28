import java.util.HashMap;

public class H4_ValidAnagram {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch :  str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch : str2.toCharArray()) {
            if(map.get(ch)!=null) { 
                if(map.get(ch)==1) {
                    map.remove(ch);
                } else {
                    map.put(ch,map.get(ch)-1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(isAnagram(str1, str2));
        
    }
}
