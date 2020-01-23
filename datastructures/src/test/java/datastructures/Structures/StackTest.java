package datastructures.Structures;


import org.checkerframework.checker.units.qual.C;
import org.junit.Before;
import org.junit.Test;
import stacksandqueues.Stack;

import static org.junit.Assert.*;

public class StackTest {
    Stack<C> testStack;

    @Before
    public void start(){
        testStack = new Stack();
    }
    @Test public void testStackPush(){
        testStack.push(2);
        assertEquals("Can successfully push onto a stack", 2, testStack.getTop().getData());
    }
    @Test public void testPeek(){
        testStack.push(4);
        assertEquals("Peek should return 4", 4, testStack.peek());
    }
    @Test public void testPopEmptyStack(){
        testStack.push(2);
        testStack.push(4);
        testStack.push(6);
        testStack.push(8);
        testStack.push(10);
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();
        testStack.pop();
        assertEquals("Can successfully empty a stack after multiple pops", null, testStack.getTop());
    }
    @Test public void testEmptyStack(){
        assertEquals("Can successfully instantiate an empty stack", null, testStack.getTop());
    }
    @Test public void testPopItem(){
        testStack.push(2);
        testStack.push(4);
        testStack.push(6);
        testStack.push(8);
        testStack.push(10);
        testStack.pop();
        assertEquals("This should pop off the fourth item in the stack which is 8", 8, testStack.pop());
    }
}
