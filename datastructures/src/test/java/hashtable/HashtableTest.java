package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable hashtable;

    @Before
    public void start(){
        hashtable = new Hashtable(1024);
    }


    @Test public void testHashTable(){
        hashtable.add("arrive", "alive");
        assertTrue(hashtable.contains("arrive"));
    }
    @Test public void testNull(){
        assertEquals(null, hashtable.get("Java"));
    }
    @Test public void testGet(){
        hashtable.add("word", "sword");
        assertEquals("sword", hashtable.get("word"));
    }
    @Test public void testGetSame(){
        hashtable.add("sword", "sword");
        assertEquals("sword", hashtable.get("sword"));
    }

    @Test public void testContains(){
        hashtable.add("hello", "world");
        assertTrue(hashtable.contains("hello"));
    }


}