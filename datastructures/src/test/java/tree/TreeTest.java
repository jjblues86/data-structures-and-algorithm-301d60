package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {
    BinarySearchTree binarySearchTree;
    Tree tree;
    Tree breadthTree;

    @Before
    public void start() {
        Tree tree = new Tree<>();
        Node nodes = new Node(2, new Node(8, new Node(6, new Node(1, new Node(3, new Node(4, new Node(9), null))))));
        breadthTree = new Tree(nodes);
    }
        @Test
        public void testEmptyTree ( ) {
            Tree tree = new Tree();
            assertNull(tree.root);
        }

        @Test
        public void testInsertBinarySearchTree ( ) {
            //      7
            //   5     9
            //4
            Node root = new Node(7, new Node(5, new Node(4), null), new Node(9));
            Tree tree = new Tree(root);
            assertEquals(7, tree.root.value);
            assertEquals(5, tree.root.left.value);
        }

        @Test
        public void testBinaryTreeIsEmpty ( ) {
            Tree tree = new Tree();
            assertTrue(tree.isEmpty());
        }

        @Test
        public void testBinarySearchTreeIsEmpty_withNodes ( ) {
            // 7
            //5 9
            Node root = new Node(7, new Node(5), new Node(9));
            Tree tree = new Tree(root);
            assertFalse(tree.isEmpty());
        }
        @Test
        public void testBinaryTreeTraverseInorder(){
            ArrayList<Integer> testTree = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
            assertEquals(testTree, tree.traverseInOrder(tree.root));
        }
        @Test
    public void testAddToBinarySearchTree(){
        binarySearchTree.root = new Node(1);
        binarySearchTree.add(2);
        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(5);
        binarySearchTree.add(6);
        assertTrue(binarySearchTree.contains(binarySearchTree.root, 6));

        }
        @Test
    public void testBreadthFirstSearch(){
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(2,8,6,1,3,4,9));
        assertEquals(output, breadthTree.breadthFirstTraversal(breadthTree.root));
        }

    }
