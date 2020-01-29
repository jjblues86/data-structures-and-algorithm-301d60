package tree;

public class Node<E> {
     E value;
     Node left;
     Node right;

    public Node(E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node(E value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int i, Node node) {

    }

    public E getValue(){
        return this.value;
    }
}
