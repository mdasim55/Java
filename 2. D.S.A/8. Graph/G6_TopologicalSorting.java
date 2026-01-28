import java.util.*;

class Edge {
    int src, dest;
    public Edge(int s, int d) {
        this.src=s;
        this.dest=d;
    }
}

public class G6_TopologicalSorting {

    public static void createGraph(ArrayList<Edge>[] graph) {
        // initilize of empty arrayList...
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        } 

        // 2 -> vertex
        graph[2].add(new Edge(2,3));

        // 3 -> vertex
        graph[3].add(new Edge(3, 1));

        // 4 -> vertex
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // 5 -> vertex
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5, 2));

    }

    // 1. Topological sorting using DFS....

    public static void topSort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<graph.length;i++) {
            if(!vis[i]) {
                topSortUtil(graph,i,vis,s);      // Modified DFS...
            }
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        } 

    }

    // 1.2  DFS Utility function...
    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++) {
            Edge edge = graph[curr].get(i);
            if(!vis[edge.dest]) {
                topSortUtil(graph,edge.dest,vis,s);
            }
        }
        s.push(curr);
    }


    // 2. Topological sorting using BFS....

    public static void calcIndeg(ArrayList<Edge>[] graph, int indeg[]) {
        for(int i=0;i<graph.length;i++) {
            for(int j=0;j<graph[i].size();j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort1(ArrayList<Edge>[] graph) {
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<graph.length;i++) {
            if(indeg[i]==0) {
                q.add(i);
            }
        }
        // BFS...
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0) {
                    q.add(e.dest);
                }
            }

        }
    }    

    // 3. Print all Paths...
    public static void printAllPath(ArrayList<Edge>[] graph, int src, int dest, String path) {
        if(src==dest) {
            System.out.println(path+dest);
            return;
        }

        for(int i=0;i<graph[src].size();i++) {
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src);[,]
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph = new ArrayList[v];     // Null --> Empty ArrayList
        createGraph(graph);
        
        // topSort(graph);
        // System.out.println();
        // topSort1(graph);

        int src=5, dest=1;
        printAllPath(graph, src, dest, "");
    }
}
