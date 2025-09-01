import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Edge {
    int src,dest,wt;
    public Edge(int s, int d, int w) {
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
}

public class G2_BFS_DFS {
    public static void createGraph(ArrayList<Edge>[] graph) {
        // initilize of empty arrayList...
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        } 

        // 0 -> vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2 -> vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[2].add(new Edge(1, 5, 1));

        // 4 -> vertex
        graph[0].add(new Edge(4, 2, 1));
        graph[3].add(new Edge(4, 3, 1));
        graph[2].add(new Edge(4, 5, 1));

        // 5 -> vertex
        graph[0].add(new Edge(5, 3, 1));
        graph[3].add(new Edge(5, 4, 1));
        graph[2].add(new Edge(5, 6, 1));

        // 6 -> vertex
        graph[0].add(new Edge(6, 5, 1));
    }
    // Breadth First search...
    public static void BFS(ArrayList<Edge>[] graph) {      // Time Complexity: O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()) {
            int curr=q.remove();
            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++) {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    // Depth First Search
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                DFS(graph,e.dest,visited);
            }
        }
    }
    // Hash Path Search....Time Complexity: O(V+E)
    public static boolean hashPath(ArrayList<Edge> graph[], int src, int dest, boolean visited[]) {
        if(src==dest) {
            return true;
        } else {
            visited[src]=true;
        }
        for(int i=0;i<graph[src].size();i++) {
            Edge e= graph[src].get(i);
            // e.dest = neighbuir
            if(!visited[e.dest] && hashPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];     // Null --> Empty ArrayList

        createGraph(graph);
        BFS(graph);

        System.out.println();

        boolean visited[] = new boolean[v];
        DFS(graph,0,visited);

        System.out.println();

        System.out.println(hashPath(graph, 0, 8, new boolean[v]));

    }
}
