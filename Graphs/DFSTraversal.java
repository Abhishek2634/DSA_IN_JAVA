package Graphs;
import java.util.*;

public class DFSTraversal {
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

    public static void dfs(ArrayList<ArrayList<Edge>> list,boolean b[] ,int curr){
        System.out.print(curr+" ");
        b[curr] = true;
        for(int i = 0; i < list.get(curr).size();i++){
            Edge e = list.get(curr).get(i);
            if(!b[e.dest]){
                dfs(list,b,e.dest);
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


        int V = 7;
        ArrayList<ArrayList<Edge>> list = new ArrayList<>(V);
        createGraph(list, V);
        dfs(list, new boolean[V], 0);

    }
}
