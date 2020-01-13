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
        assertSame("One node of value 2 is inserted at the head", 2);
    }

}
