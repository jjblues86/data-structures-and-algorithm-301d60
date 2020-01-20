package stacksandqueues;

import java.util.NoSuchElementException;

public class Stack {
    private Node top; //the top item in the stack
    private int n; //size of the stack

    public Stack(){
        this.top = null;
        this.n = 0;
    }

    //Define a method called push
    public void push(int data){
        Node prevNode = top;
        this.top = new Node(data, prevNode);
        top.data = data;
        top.next = prevNode;
        n++;
    }

    //Define a method called pop
    public int pop(){
        if(top == null){
            throw new NoSuchElementException("Stack is Empty");//Constructs a NoSuchElementException with null as its error message string
        } else {
            Node prevNode = this.top;
            this.top = this.top.next;
            prevNode.next = null;
            n--;
            return prevNode.getData();
        }
    }

    //Define a method called peek
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is Empty");//Constructs a NoSuchElementException with null as its error message string
        }
        return this.top.getData();

    }

    //Define a method called isEmpty
    public boolean isEmpty(){
        return this.top == null;
    }


    public Node getTop() {
        return top;
    }

    public int getN() {
        return n;
    }
}
