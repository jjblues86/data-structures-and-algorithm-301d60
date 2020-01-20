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
            throw new NullPointerException("QUeue is Empty");//Constructs a NoSuchElementException with null as its error message string
        }
        return this.first.getData();

    }

    //Can successfully enqueue into a queue
    public void enqueue(int data){
        Node prevNode = back;
        this.back = new Node(data, prevNode);
        back.data = data;
        back.next = null;
        n++;
    }

    //Define a method called dequeue
    public int dequeue() {
        if (this.first == null) {
            throw new NullPointerException("Queue is empty");
        } else {
            Node prevNode = this.first;
            this.first = this.first.next;
            prevNode.next = null;
            n--;
            return prevNode.getData();
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
