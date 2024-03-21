package Graphs;

import java.util.ArrayList;

public class HasPath {
    public static class Edge{
        int start;
        int end;
        int weight;
        Edge(int s,int d,int w){
            this.start = s;
            this.end = d;
            this.weight = w;
        }
    }
    public static void createGraph(ArrayList<ArrayList<Edge>>list,int n){
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
    public static boolean hasPath(ArrayList<ArrayList<Edge>>list,int curr,int dest,boolean[]arr){
        if(curr == dest ) return true;
        arr[curr] = true;
        for(int i = 0;i < list.get(curr).size();i++){
            Edge e = list.get(curr).get(i);
            // e.end is the neighbour of the current vertex.
            if(!arr[e.end] && hasPath(list, e.end, dest, arr)){
                return true;
            }
        }
        return false;
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
        System.out.println(hasPath(list,0,7,new boolean[V]));
    }
}
