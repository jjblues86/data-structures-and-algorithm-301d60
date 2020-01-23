package stacksandqueues;

import org.checkerframework.checker.units.qual.C;

public class PseudoQueue {
    Stack stack1;
    Stack stack2;

    public PseudoQueue(){
        stack1 = new Stack();
        stack2 = new Stack();
    }


    //check to see if both stacks are empty
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    //check for the size of both queues
    public int size(){
        return stack1.getN() + stack2.getN();
    }

    //push an item into the queue
    public void enqueue(int data){
        stack1.push(data);
    }

    //push all items from stack1 into stack2
    //remove items from stack2 back into stack1
    public int dequeue(){
        Node top = this.stack2.getTop();
        if(top == null){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
