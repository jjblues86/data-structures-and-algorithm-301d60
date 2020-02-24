package graph;

public class Edge<T> {
    int weight;
    Node<T> one;
    Node<T> two;

    public Edge(int weight, Node<T> one, Node<T> two) {
        this.weight = weight;
        this.one = one;
        this.two = two;
    }

    public int getWeight() {
        return weight;
    }

    public Node<T> getOne() {
        return one;
    }

    public Node<T> getTwo() {
        return two;
    }
}
