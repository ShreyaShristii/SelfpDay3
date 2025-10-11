// import java.util.*;
// public class Graph {
//     public static void main(String srgs[]){
//         int v=4;

//         ArrayList<Edge> graph[]=new ArrayList[v];
//     }
// }
// static class Edge{
//     int src;
//     int des;
//     public Edge(int s,int d){
//         this.src=s;
//         this.des=d; 
//     }
// }
// public static void cg(ArrayList<Edge> graph[]){
    
// }
import java.util.*;
public class Graph{
    static class Edge{
        int src;
        int des;
        public Edge(int s,int d){
            this.src=s;
            this.des=d;
        }
    }
    public static void cg(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        //graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));



    }
    public static void main(String args[]){
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        cg(graph);
        System.out.println("Adjacency List:");
        for(int i=0;i<v;i++){
            System.out.print(i+"->");
            for(Edge e: graph[i]){
                System.out.print(e.des+" ");
            }
            System.out.println();
        }
    }

}