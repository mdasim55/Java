import java.util.*;

public class G7_ChipestFlight {
    
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
    static class Info {
        int node;
        int cost;
        int stop;
        public Info(int node, int cost, int stop) {
            this.node = node;
            this.cost = cost;
            this.stop = stop;
        }
    }
    public static void createGraph(int[][] flight, ArrayList<Edge> graph[]) {

        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<flight.length;i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            Edge e = new Edge(src,dest,wt);
            graph[src].add(e);
        }
    }
    public static int chipestFlight(int n, int src, int dest, int k, int flights[][]) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int dist[] = new int[n];
        for(int i=0;i<n;i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src,0 , 0));
        while(!q.isEmpty()) {
            Info curr = q.poll();
            if(curr.stop>k) {
                break;
            }
            for(int i=0;i<graph[curr.node].size();i++) {
                Edge e = graph[curr.node].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if(curr.cost+wt < dist[v] && curr.stop<=k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stop+1));
                }
            }
        }

        // dist[dest]
        if(dist[dest]==Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0, dest=3, k=1;

        ArrayList<Edge> graph[] = new ArrayList[n];
        System.out.println(chipestFlight(n, src, dest, k, flights));
    }
}
