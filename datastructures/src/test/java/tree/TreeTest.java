package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testEmptyTree() {
        Tree tree = new Tree();
        assertNull(tree.root);
    }

    @Test
    public void testInsertBinarySearchTree() {
        //      7
        //   5     9
        //4
        Node root = new Node(7, new Node(5, new Node(4), null), new Node(9));
        Tree tree = new Tree(root);
        assertEquals(7, tree.root.value);
        assertEquals(5, tree.root.left.value);
    }

    @Test
    public void testBinaryTreeIsEmpty() {
        Tree tree = new Tree();
        assertTrue(tree.isEmpty());
    }

    @Test
    public void testBinarySearchTreeIsEmpty_withNodes() {
        // 7
        //5 9
        Node root = new Node(7, new Node(5), new Node(9));
        Tree tree = new Tree(root);
        assertFalse(tree.isEmpty());
    }

}
//    @Test
//    public void testBinaryTreeTraverseInorder(){
//        //      7
//        //  5      9
//        //4   6  8
//        Node root = new Node(7, new Node(5, new Node(4), new Node(6)), new Node(9), new Node(8), null);
//        Tree tree = new Tree(root);
//        tree.traverseInOrder(tree.root);
//        assertEquals((int)tree.traverseInOrder(root.value));
//        ArrayList<Integer> trees = new ArrayList<>(Arrays.asList(4,5,6,7,8,9));
//        assertEquals(trees);
