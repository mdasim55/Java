import java.util.*;

public class G9_ConnectingCities {

    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;
        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge e2) {
            return Integer.compare(this.cost, e2.cost);
        }
    }
    // Connecting cities Using prims Algorithm.....
    public static int ConnectingCities(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[cities.length];

        pq.offer(new Edge(0,0));
        int minCost = 0;
        while(!pq.isEmpty()) {
            Edge curr = pq.poll();
            if(!visited[curr.dest]) {
                visited[curr.dest] = true;
                minCost += curr.cost;

                for(int i=0;i<cities[curr.dest].length;i++) {
                    if(cities[curr.cost][i] != 0) {
                        pq.offer(new Edge(i,cities[curr.cost][i]));
                    } 
                }
            }
        }

        return minCost;
    }
    public static void main(String[] args) {
        int cities[][] = {
            { 0, 1, 2, 3, 4 },
            { 1, 0, 5, 0, 7 },
            { 2, 5, 0, 6, 0 },
            { 3, 0, 6, 0, 0 },
            { 4, 7, 0, 0, 0 }
        };
        System.out.println(ConnectingCities(cities));
    }
}
