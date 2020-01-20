package datastructures.Structures;

import org.junit.Before;
import org.junit.Test;
import stacksandqueues.Queue;
import stacksandqueues.Stack;

import static org.junit.Assert.*;

public class QueueTest {
    Queue testQueue;

    @Before
    public void start(){
        testQueue = new Queue();
    }
    @Test public void testEnqueue(){
        testQueue.enqueue(2);
        testQueue.enqueue(4);
        testQueue.enqueue(6);
        assertEquals("Can successfully enqueue into a queue number 2", 3, testQueue.getN());
    }
    @Test public void testDequeue(){
        testQueue.enqueue(2);
        testQueue.enqueue(4);
        testQueue.enqueue(6);
        testQueue.dequeue();
        assertEquals("Can successfully dequeue out of a queue the expected value of 6", 6, testQueue.dequeue());
    }
    @Test public void testInstantiateEmptyQueue(){
        assertEquals("Can successfully instantiate an empty queue", null, testQueue.getFirst());
    }
    @Test public void testPeekQueue(){
        testQueue.enqueue(4);
        assertEquals("Can successfully peek into a queue, seeing the expected value", 4, testQueue.peek());
    }
    @Test public void testPopEmptyStack(){
        testQueue.enqueue(2);
        testQueue.enqueue(4);
        testQueue.enqueue(6);
        testQueue.enqueue(8);
        testQueue.enqueue(10);
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        assertEquals("Can successfully empty a queue after multiple pops", null, testQueue.first);
    }
}
