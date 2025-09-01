import java.util.ArrayList;

class Edge {
    int src,dest;
    public Edge(int s,int d) {
        this.src=s;
        this.dest=d;
    }
}
public class G4_CycleDetection {
    public static void createGraph(ArrayList<Edge>[] graph) {
        // initilize of empty arrayList...
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        } 

        // 0 -> vertex
        graph[0].add(new Edge(0, 1));
        //graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // 1 -> vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // 2 -> vertex
        graph[2].add(new Edge(2, 1));
        //graph[2].add(new Edge(2, 0));

        // 3 -> vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // 4 -> vertex
        graph[4].add(new Edge(4, 3));
    }
    public static boolean cycleDetection(ArrayList<Edge> graph[]) {
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++) {
            if(!visited[i]) {
                if(utilityCycleDetection(graph,visited,i,-1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean utilityCycleDetection(ArrayList<Edge> graph[], boolean visited[], int curr, int par) {
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            // case 1: 
            if(!visited[e.dest]) {
                if(utilityCycleDetection(graph, visited, e.dest, curr)) {
                    return true;
                }
            }
            // case 2:
            else if(visited[e.dest] && e.dest!=par ) {
                return true;
            }
            // case 3: do nothing...> Continue
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(cycleDetection(graph));
    }
}
