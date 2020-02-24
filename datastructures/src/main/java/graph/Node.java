package graph;

import java.util.HashSet;
import java.util.Set;

public class Node<T> {
     T data;
//    public Node<T> next;
    Set<Edge> edges;

    public Node(T data) {
        this.data = data;
//        this.next = next;
            edges = new HashSet<>();
    }


    public T getData() {
        return data;
    }

//    public Node<T> getNext() {
//        return next;
//    }

//    public Set<T> getEdges() {
//        return edges;
//    }
}
