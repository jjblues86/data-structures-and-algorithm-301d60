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
    @Test public void testInsert(){
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
    @Test public void testAppend(){
        list.append("any value");
        assertEquals("This should add a node at the end of the list","HEAD -> " +
                "any value -> null", list.toString());
    }
    @Test public void testMultipleAppend(){
        list.append("any value");
        list.append("something else");
        assertEquals("This should add a node at the end of the list","HEAD -> " +
                "any vale -> Something else -> null", list.toString());
    }
    @Test public void testInsertBefore(){
        list.append(2);
        list.append(4);
        list.append(8);
        list.insertBefore(6,8);
        assertEquals("This should add a node before the targeted value of the list","HEAD -> 2 -> 4 -> 6 -> 8 -> null", list.toString());
    }
    @Test public void testInserAfter(){
        list.append(2);
        list.append(4);
        list.append(8);
        list.insertBefore(6,8);
        assertEquals("This should add a node after the targeted value of the list","HEAD -> 2 -> 4 -> 8 -> 6 -> null", list.toString());

    }
    @Test public void testKthFromEnd(){
        list.append(2);
        list.append(4);
        list.append(8);
        assertEquals("This should return the value of the position 2 in the linked list", 2, list.kthFromEnd(2));
    }
    @Test (expected = IllegalArgumentException.class)
    public void outOfBoundsKthValue(){
        list.insert(7);
        assertEquals("This position does not exist in the list", 7);
    }

}
