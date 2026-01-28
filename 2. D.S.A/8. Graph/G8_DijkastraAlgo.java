import java.util.*;

public class G8_DijkastraAlgo {

    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt; 
        }
    }
    static class Pair implements Comparable<Pair>{
        int node;           // The current node...
        int path;           // The total cost...
        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;                 // path based sorting for my pairs
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        // initilize of empty arrayList...
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        } 

        // 0 -> vertex
        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));

        // 1 -> vertex
        graph[1].add(new Edge(1, 3,7));
        graph[1].add(new Edge(1, 2,1));

        // 2 -> vertex
        graph[2].add(new Edge(2, 4,3));

        // 3 -> vertex
        graph[3].add(new Edge(3, 5,1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 3,5));
    }
    // DijKAstra Algorithm...
    public static void dijkastraAlgo(ArrayList<Edge> graph[], int src) {
        int dest[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++) {
            dest[i] = Integer.MAX_VALUE;
        }
        dest[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()) {
            Pair curr = pq.poll();
            if(!vis[curr.node]) {
                vis[curr.node] = true;
                // Neighbour...
                for(int i=0;i<graph[curr.node].size();i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dest[u]+wt < dest[v]) {
                        dest[v] = dest[u]+wt;
                        pq.add(new Pair(v,dest[v]));
                    }
                }
            }
        }

        // print all source to vertices shortest distance...
        for(int i=0;i<dest.length;i++) {
            System.out.print(dest[i]+" ");
        }

    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int src = 0;
        dijkastraAlgo(graph,src);
    }
}
