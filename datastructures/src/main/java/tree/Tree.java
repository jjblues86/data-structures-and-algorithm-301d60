package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree<E> {
    public Node<E> root;

    public Tree() {
        this.root = null;
    }


    //create a default constructor
    public Tree(Node<E> root){
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
    public ArrayList<E> traversePreOrder(Node<E> node){
        if(node == null){
            return new ArrayList<E>();
        } else {
            ArrayList<E> left = traversePreOrder(node.left);
            ArrayList<E> right = traversePreOrder(node.right);

            ArrayList<E> output = new ArrayList<>();
            output.add(node.value);
            output.addAll(left);
            output.addAll(right);
            return output;

        }
    }

    //post-order: left -> right -> root
    public ArrayList<E> traversePostOrder(Node<E> node){
        if(node == null){
            return new ArrayList<E>();
        } else {
            ArrayList<E> left = traversePostOrder(node.left);
            ArrayList<E> right = traversePostOrder(node.right);

            ArrayList<E> output = new ArrayList<>();
            output.addAll(left);
            output.addAll(right);
            output.add(node.value);
            return output;

        }
    }

    //in-order: left -> root -> right
    public ArrayList<E> traverseInOrder(Node<E> node){
        if(node == null){
            return new ArrayList<E>();
        } else {
            ArrayList<E> left = traverseInOrder(node.left);
            ArrayList<E> right = traverseInOrder(node.right);

            ArrayList<E> output = new ArrayList<>();
            output.addAll(left);
            output.add(node.value);
            output.addAll(right);
            return output;

        }
    }

    public ArrayList<E> breadthFirstTraversal(Node<E> root){
        ArrayList<E> outcome = new ArrayList<>();
        Queue<Node> newQ = (Queue<Node>) new stacksandqueues.Queue();
        newQ.add(root);
        while(!newQ.isEmpty()){
            Node current = newQ.remove();
            outcome.add((E) current.value);
            if(current.left != null){
                newQ.add(current.left);
            }
            if(current.right != null){
                newQ.add(current.right);
            }
        }
        return outcome;
    }


}



    //pre-order: root -> left -> right
//    public void traversePreOrder(Node node){
//        if(node != null){
//            System.out.println("node = " + node.value);
//            traversePreOrder(node.left);
//            traversePreOrder(node.right);
//        }
//    }

    //post-order: left -> right -> root
//    public void traversePostOrder(Node node){
//        if(node != null){
//            traversePostOrder(node.left);
//            traversePostOrder(node.right);
//            System.out.println("node = " + node.value);
//        }
//    }

    //in-order: left -> root -> right
//    public void traverseInOrder(Node node){
//        if(node != null){
//            traverseInOrder(node.left);
//            System.out.println("node = " + node.value);
//            traverseInOrder(node.right);
//        }
//    }
