// 8. Tower of Hanoi                              Rules:  1. Only 1 disk transferred in 1 step 
//                                                        2. Smnaller disk are always kept on top of larger disk

public class Qs8 {
    public static void TowerOfHanoi(int n,String src,String helper,String dest) {
        if(n==1) {
            System.out.println("Transfer disk no "+n+" from "+src+" to "+dest);
        }
        TowerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk no "+n+" from "+src+" to "+dest);
         
    }
}
