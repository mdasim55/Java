import java.util.ArrayList;

class Edge {
    int src,dest,wt;
    public Edge(int s, int d, int w) {
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
} 
public class G1_Implementation {
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph = new ArrayList[v];     // Null --> Empty ArrayList

        // initilize of empty arrayList...
        for(int i=0;i<v;i++) {
            graph[i] = new ArrayList<>();
        } 

        // 0 -> vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -> vertex
        graph[0].add(new Edge(4, 2, 2));
     
        
        // For vertex 2 print all the adjecen node
        for(int i=0;i<graph[2].size();i++) {
            Edge e1=graph[2].get(i);
            System.out.println(e1.dest+" "+e1.wt);
        }
    }
}
