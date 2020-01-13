package Data.Structures;

import Data.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class linkedListTest {
    LinkedList list;
    @Before
    public void start(){
        list = new LinkedList();
    }
    @Test public void insertTest(){
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);

        assertSame("One node of value 2 is inserted at the head", 2);
    }
    @Test public void testIncludesTrue(){
        list.includes("any value");
        assertTrue("This should return a boolean of true if the linkedlist has the value", list.includes("any value"));
    }
    @Test public void testIncludesFalse(){
        list.includes("any value");
        assertTrue("This should return a boolean of false if the linkedlist does not have the value", list.includes("any value"));
    }
    @Test public void testToString(){
        list.insert("ll");
        list.insert("java");
        assertEquals("This should return a collection of values that exist in the linked list", list.toString());
    }
//    @Test public void testEmpty(){
//        assertNull("The linkedlist head should be null", list.head);
//    }

}
