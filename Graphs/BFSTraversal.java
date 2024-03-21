package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    public static class Edge{
        int start;
        int dest;
        int weight;
        Edge(int s,int d,int w){
            this.start = s;
            this.dest  = d;
            this.weight = w;
        }
    }
    public static void createGraph(ArrayList<ArrayList<Edge>> list,int n){
        for(int i = 0; i < n;i++){
            list.add(new ArrayList<>());
        }
        // 0 vertex.
        list.get(0).add(new Edge(0,1, 1));
        list.get(0).add(new Edge(0,2, 1));

        // 1 vertex
        list.get(1).add(new Edge(1,3, 1));
        list.get(1).add(new Edge(1, 0, 1));

        // 2 vertex
        list.get(2).add(new Edge(2,4, 1));

        // 3 vertex
        list.get(3).add(new Edge(3,5, 1));
        list.get(3).add(new Edge(3,4, 1));
        list.get(3).add(new Edge(3,1, 1));

        // 4 vertex
        list.get(4).add(new Edge(4,5, 1));
        list.get(4).add(new Edge(4,3, 1));
        list.get(4).add(new Edge(4,2, 1));

        // 5 vertex
        list.get(5).add(new Edge(5,6, 1));
        list.get(5).add(new Edge(5,3, 1));
        list.get(5).add(new Edge(5,4, 1));

        // 6 vertex
        list.get(6).add(new Edge(6,5, 1));
    }
    public static void bfs(ArrayList<ArrayList<Edge>> list){ // t.c - O(V + E) where V is the vertex and E is the Edge
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // base 
        boolean visit [] = new boolean[list.size()];
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visit[curr]){
                System.out.print(curr+" ");
                visit[curr] = true;
            }
            for(int i = 0;i < list.get(curr).size();i++){
                Edge e = list.get(curr).get(i);
                q.add(e.dest);
            }
        }
    }
    public static void main(String[] args) {
        /*
         *      1 ----- 3 \ 
         *    /         |  \
         *   0          |   5 ----- 6
         *    \         |  /
         *     2 ----- 4 /
         */

         int totalEdges = 7;
         ArrayList<ArrayList<Edge>> list = new ArrayList<>(totalEdges);
         createGraph(list, totalEdges);
         bfs(list);
    }
    
}
