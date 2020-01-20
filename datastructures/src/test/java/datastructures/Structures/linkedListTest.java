package datastructures.Structures;

import datastructures.LinkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class linkedListTest {
    LinkedList list;
    LinkedList listTwo;

    @Before
    public void start(){
        list = new LinkedList();
        listTwo = new LinkedList();

    }

    @Test public void testInsert(){
        list.insert(8);
        list.insert(6);
        list.insert(4);
        list.insert(2);
        assertSame("A node with value of 2 is inserted at the head", 2, list.getHead());
        assertTrue("One node of value 4 is inserted at the head", list.includes(4));
    }


    @Test public void testIncludesTrue(){
        list.insert("any value");
        assertTrue("This should return a boolean of true if the linkedlist has the value", list.includes("any value"));
    }
    @Test public void testIncludesFalse(){
        list.insert("any value");
        assertTrue("This should return a boolean of false if the linkedlist does not have the value", list.includes("any value"));
    }

    @Test public void testAppend(){
        list.append(2);
        assertEquals("This should add a node at the end of the list",2, list.getHead());
    }
    @Test public void testMultipleAppend(){
//        list.append("[any value]");
        list.append("[something else]");
//        assertEquals("This should add a node at the end of the list","[any value]",  list.getHead());
        assertEquals("This should add a node at the end of the list","[something else]",  list.getHead());

    }
    @Test public void testInsertBefore(){
        list.append(2);
        list.append(4);
        list.append(8);
        list.insertBefore(6,8);
        assertEquals("This should search and insert the element with data of 6 in the list", 8, list.getHead());
//        assertEquals("This should add a node before the targeted value of the list","HEAD -> 2 -> 4 -> 6 -> 8 -> null", list.toString());
    }
    @Test public void testInserAfter(){
        list.append(2);
        list.append(4);
        list.append(8);
        list.insertBefore(6,8);
//        assertEquals("This should add a node after the targeted value of the list","HEAD -> 2 -> 4 -> 8 -> 6 -> null", list.toString());

    }
//    @Test public void testKthFromEnd(){
//        list.append(2);
//        list.append(4);
//        list.append(2);
//        assertEquals("This should return the value of the position 2 in the linked list", 4, list.kthFromEnd(4));
//    }
    @Test (expected = IllegalArgumentException.class)
    public void outOfBoundsKthValue(){
        list.insert(7);
        list.kthFromEnd(7);
//        assertEquals("This position does not exist in the list", 7, list.kthFromEnd(7));
    }
    @Test public void testMergeLists(){
        list.append(2);
        list.append(4);
        list.append(6);
        listTwo.append(8);
        listTwo.append(10);
        listTwo.append(12);
        assertEquals("The two lists should merge together", "[2, 8]", LinkedList.mergeList(list,listTwo).toString());
    }

}
