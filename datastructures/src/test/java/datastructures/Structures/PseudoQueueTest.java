package datastructures.Structures;

import org.junit.Before;
import org.junit.Test;
import stacksandqueues.PseudoQueue;
import stacksandqueues.Stack;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue pseudoQueue;

    @Before
    public void start(){
        pseudoQueue = new PseudoQueue();
    }
    @Test public void testSizePseudoQueue(){
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(7);
        assertEquals("This should add 2 items into the stack", 4, pseudoQueue.size());
    }
    @Test public void testDequeuePseudoQueue(){
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(5);
        assertEquals("This should remove 1 from the stack", 1, pseudoQueue.dequeue());
    }
    @Test public void testEnqueuePseudoQueue(){
        assertEquals("This should return empty", true, pseudoQueue.isEmpty());

    }
}
