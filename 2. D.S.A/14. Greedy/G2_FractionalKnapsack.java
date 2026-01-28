import java.util.Comparator;
import java.util.Arrays;

public class G2_FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int w = 50;
        double ratio[][] = new double[value.length][2];

        // 0 col -> idx, 1 col-> ratio...
        for(int i=0;i<ratio[0].length;i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/weight[i];
        }
        // Ascending order...
        Arrays.sort(ratio, Comparator.comparingDouble(o -> 0[1]));
        int capacity = w;
        int currVal = 0;
        for(int i=ratio.length-1;i>=0;i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) {
                currVal += value[idx];
                capacity -= weight[idx];
            } else {
                currVal =+ (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println(currVal);
    }
}
