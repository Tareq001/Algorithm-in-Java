import java.util.LinkedList;

/**
 * GFG
 */
public class GFG {

    //A user defined class to represent a graph
    //A graph is an array of adjacency list 
    //size of array will be v(number of vertices in graph)
    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];
        //constructor

        Graph(int V){
            this.V = V;

            //Define the size of array as number of vertices 

            adjListArray = new LinkedList[V];
            //Create a new list for each vertex
            //Such that adjacent nodes can be stored 
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
        
    }
    static void addEdge(Graph graph,int src,int dest){
        //add and edge from src to dest
        graph.adjListArray[src].add(dest);
        //Since graph is undirected
        graph.adjListArray[dest].add(src);
    }
    static void printGraph(Graph graph){
        for (int v = 0; v < graph.V; v++) {
            System.out.println("Adjacency List of vertex " + v);
            System.out.println("Head");
            for (Integer pCrawl : graph.adjListArray[v]) {
                System.out.println(" => "+pCrawl);
                
            }
            System.out.println("\n");
            
        }
    }

    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph,0,1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2,3 );
        addEdge(graph, 3, 4);
        printGraph(graph);
    }
}