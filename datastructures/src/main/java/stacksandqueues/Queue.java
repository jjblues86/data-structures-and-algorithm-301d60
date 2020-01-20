package stacksandqueues;


public class Queue {
    public Node first;
    public Node back;
    public int n;

    public Queue(){
        first = null;
        back = null;
        n = 0;
    }

    //Define a method called isEmpty
    public boolean isEmpty(){
        return this.first == null;
    }

    //Define a method called peek
    public int peek(){
        if(isEmpty()){
            throw new NullPointerException("QUeue is Empty");
        }
        return this.first.getData();

    }

    //Can successfully enqueue into a queue
    public void enqueue(int data){
        Node prevNode = first;
        this.first = new Node(data, prevNode);
        first.data = data;
        first.next = prevNode;
        n++;
    }

    //Define a method called dequeue
    public int dequeue() {

        if(this.first != null){
            Node prevNode = this.first;
            this.first = this.first.next;
            prevNode.next = null;
            n--;
            return prevNode.getData();
        } else {
            throw new NullPointerException("Queue is empty");
        }
    }

    public Node getFirst() {
        return first;
    }

    public Node getBack() {
        return back;
    }

    public int getN() {
        return n;
    }
}
