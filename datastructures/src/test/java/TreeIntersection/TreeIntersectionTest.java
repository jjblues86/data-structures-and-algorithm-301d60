package TreeIntersection;

import org.junit.Before;
import org.junit.Test;
import tree.Node;
import tree.Tree;

import static org.junit.Assert.*;

import java.util.HashSet;

public class TreeIntersectionTest {

    Tree tree;
    Tree breadthTree;

    @Before
    public void start() {
        Tree tree = new Tree<>();
        Node nodes = new Node(2, new Node(8, new Node(6, new Node(1, new Node(3, new Node(4, new Node(9), null))))));
        breadthTree = new Tree(nodes);
    }
    @Test public void testTreeIntersection(){
        HashSet expected = new HashSet(){};
        expected.add(15);
        expected.add(15);
        expected.add(20);
        expected.add(25);
        assertEquals(expected, TreeIntersection.tree_intersection(tree, breadthTree));
    }
}
