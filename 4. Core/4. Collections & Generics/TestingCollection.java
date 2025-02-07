import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>();
        numList.add(5);
        numList.add(10);
        numList.add(-5);
        numList.add(17);
        numList.add(-78);
        Utility.print(numList);

        Collections.sort(numList);              // Sort the elements..
        Utility.print(numList);

        Collections.reverse(numList);              // Reverse the elements..
        Utility.print(numList);
    
        List<Integer> unmodifiable=Collections.unmodifiableList(numList);
        unmodifiable.add(55);
        Utility.print(unmodifiable);
    
    }
}
