package Graphs;
import java.util.*;
public class CreationOfGraphs {
        static class Edge{
        int src ;
        int dest ;
        int weight ;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
public static void main(String[] args) {
    // using Adjacency List;

    /*            (5)
     *       0 --------  1
     *                  / \
     *            (1) /    \ (3)
     *              /       \
     *             2 ------- 3
     *            |    (1)
     *        (2)|  
     *          |
     *          4
     */

     int V = 5;  // no. of edges.
     ArrayList<ArrayList<Edge>>Graph = new ArrayList<>(V); // empty array of type ArrayList<Edge>  -- > null;

     for(int i = 0; i < V;i++){
        Graph.add(new ArrayList<>());
     }

     // 0 vertex
     Graph.get(0).add(new Edge(0,1,5)); //   start ,destination , weight;

     // 1 vertex
     Graph.get(1).add(new Edge(1, 2, 1));
     Graph.get(1).add(new Edge(1, 3, 3));
     Graph.get(1).add(new Edge(1, 0, 5));

     // 2 vertex
     Graph.get(2).add(new Edge(2,3,1));
     Graph.get(2).add(new Edge(2,4,2));
     Graph.get(2).add(new Edge(2,1,1));

     // 3 vertex
     Graph.get(3).add(new Edge(3,2,1));
     Graph.get(3).add(new Edge(3,1,3));

     // 4 vertex
     Graph.get(4).add(new Edge(4,2,2));


     // find neighbours of 2;
     for(int i = 0; i < Graph.get(2).size();i++){
        Edge e = Graph.get(2).get(i);
        System.out.println(e.dest);
     }






                        
}
    
}
