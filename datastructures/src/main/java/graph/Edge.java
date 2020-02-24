package graph;

public class Edge<T> {
    int weight;
    T one;
    T two;

    public Edge(int weight, T one, T two) {
        this.weight = weight;
        this.one = one;
        this.two = two;
    }

    public int getWeight() {
        return weight;
    }

    public T getOne() {
        return one;
    }

    public T getTwo() {
        return two;
    }
}
