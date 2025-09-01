import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Edge {
    int src,dest;
    public Edge(int s, int d) {
        this.src=s;
        this.dest=d;
    }
}
public class G5_Bipartite {
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Empty ArrayList  --> Null ArrayList
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();  
        }
        
        // 0 -> vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        // 4 -> vertex
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
    }

    public static boolean bipartite(ArrayList<Edge> graph[]) {
        int color[] = new int[graph.length];
        for(int i=0;i<graph.length;i++) {
            color[i]=-1;            // No Color...
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++) {
            if(color[i]==-1) {
                q.add(i);
                color[i]=0;         // Yellow...
                while(!q.isEmpty()) {
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++) {
                        Edge e = graph[curr].get(j);

                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}
