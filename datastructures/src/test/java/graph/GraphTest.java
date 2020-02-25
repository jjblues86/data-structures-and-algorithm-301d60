package graph;

import static org.junit.Assert.*;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import java.util.List;


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

    //BreadthFirstSearch
    @Test
    public void testBFS(){
        start();

        Node bfs1 = testGraph.addNode(25);
        Node bfs2 = testGraph.addNode(30);
        Node bfs3 = testGraph.addNode(35);
        Node bfs4 = testGraph.addNode(40);
        Node bfs5 = testGraph.addNode(45);

        testGraph.addNode(6);
        testGraph.addNode(7);
        testGraph.addNode(8);
        testGraph.addNode(9);
        testGraph.addNode(10);

        List<Node> breadth = testGraph.bfs(bfs1);
        assertEquals(10, testGraph.size());
        assertTrue(testGraph.getNeighbors(bfs2).contains(bfs1));
        assertTrue(testGraph.getNeighbors(bfs3).contains(bfs4));



    }
}
