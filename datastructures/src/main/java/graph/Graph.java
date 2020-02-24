package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph<T> {
    private Map<Node, Set< Node<T>>> vertices;

    //Constructor

    public Graph() {
        this.vertices = new HashMap<>();
    }

    //AddNode()
    public Node addNode(T data){
        Node newNode;
        if(data != null){
            newNode = new Node<>(data);
            vertices.put(newNode, new HashSet<>());
            return newNode;
        }
        return null;
    }

    //AddEdge()
    public void addEdge(int weight,Node one, Node two){
        if(vertices.containsKey(one) && vertices.containsKey(two)){
            Edge edge = new Edge<>(weight, one, two);
            vertices.get(one).add((two));
            one.edges.add(one);
            vertices.put((one), vertices.get(one));

            vertices.get(two).add((one));
            two.edges.add(two);
            vertices.put((two) , vertices.get(two));
        }
    }

    //GetNodes()
    public Set<Node> getNodes(){
        return vertices.keySet();
    }

    //GetNeighbors()
    public Set<Node<T>> getNeighbors(Node vertex){
        if(vertices.containsKey(vertex)){
            return vertices.get(vertex);
        }
        return null;
    }

    //Size()
    public int size(){
       return this.vertices.size();
    }

}
