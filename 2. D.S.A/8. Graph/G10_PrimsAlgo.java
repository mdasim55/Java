import java.util.*;

public class G10_PrimsAlgo {

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
    static class Info implements Comparable<Info>{
        int node;
        int cost;
        public Info(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
        @Override
        public int compareTo(Info n2) {
            return Integer.compare(this.cost, n2.cost);
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        // initilize of empty arrayList...
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        } 

        // 0 -> vertex
        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(0, 3,30));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3,40));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0,15));
        graph[2].add(new Edge(2, 3,50));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1,40));
        graph[3].add(new Edge(3, 2,50));
    }
    static public int PrimsAlgorithm(ArrayList<Edge> graph[]) {
        PriorityQueue<Info> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[graph.length];
        int minCost = 0;
        pq.offer(new Info(0,0));
        while(!pq.isEmpty()) {
            Info curr = pq.poll();
            if(!visited[curr.node]) {
                visited[curr.node] = true;
                minCost += curr.cost;

                for(int i=0;i<graph[curr.node].size();i++) {
                    Edge e = graph[curr.node].get(i);
                    pq.offer(new Info(e.dest,e.wt));
                }
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(PrimsAlgorithm(graph));
    }
}
