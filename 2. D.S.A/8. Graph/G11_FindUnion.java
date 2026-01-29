

public class G11_FindUnion {

    static int v = 8;
    static int par[] = new int[v];
    static int rank[] = new int[v];

    public static void init() {
        for(int i=0;i<v;i++) {
            par[i] = i;
        }
    }
    public static int find(int x) {
        if(par[x]==x) return x;
        return find(par[x]);
    }
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if(rank[parA]==rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,4);
    }    
}
