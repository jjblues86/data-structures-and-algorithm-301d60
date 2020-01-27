package tree;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }


    //create a default constructor
    public Tree(Node root){
        this.root = root;
    }

    public boolean isEmpty(){
        return null == root;
    }


    //if new node value is lower than the current node -> go to the left
    //if new node value is greater than the current node -> go to the right
    //if the current node is null -> a leaf node exist and therefore insert new node in that position
    //depth-first traversal

    //pre-order: root -> left -> right
    public void traversePreOrder(Node node){
        if(node != null){
            System.out.println("node = " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
//    public List<? extends Object> traversePreOrder(Node<E> node){
//        if(node != null){
//            return new ArrayList<E>();
//        } else {
//            ArrayList<Integer> left = traverseInOrder(node.left);
//            ArrayList<E> right = (ArrayList<E>) traverseInOrder(node.right);
//
//            ArrayList<Integer> outcome = new ArrayList<>();
//            outcome.addAll(left);
//            outcome.add(node.value);
//            outcome.addAll((Collection<? extends Integer>) right);
//            return outcome;
//
//        }
//
//    }

    //post-order: left -> right -> root
    public void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println("node = " + node.value);
        }
    }

    //in-order: left -> root -> right
    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println("node = " + node.value);
            traverseInOrder(node.right);
        }
    }
}
