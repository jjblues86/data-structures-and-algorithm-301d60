package graph;

import static org.junit.Assert.*;

import graph.Graph;
import graph.Node;
import org.junit.Test;


public class GraphTest {
    private Graph<Integer> testGraph;

    @Test
    public void start(){
        testGraph = new Graph<>();
    }

    @Test
    public void testAddNode(){
        start();

        Node testing = testGraph.addNode(6);
        testGraph.addNode(6);
        testGraph.addNode(6);

        assertEquals(3, testGraph.size());
    }
    @Test
    public void testAddNeighbors(){
        start();

        Node adding1 = testGraph.addNode(4);
        System.out.println("adding1 = " + adding1);
        Node adding2 = testGraph.addNode(4);
        assertEquals(2, testGraph.size());
        assertTrue(testGraph.getNeighbors(adding2).contains(adding1));
        assertTrue(testGraph.getNeighbors(adding1).contains(adding2));
    }
}
