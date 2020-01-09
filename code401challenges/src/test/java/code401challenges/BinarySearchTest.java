package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void binarySearchTest(){
        int[] inputArray = {-14,2,3,5,8,13,22};
        int value = 5;
        assertEquals("The midpoint value of this array is at index : ", 3, BinarySearch.binarySearch(inputArray, value));
    }
    @Test public void unsortedBinarySearchTest(){
        int[] inputArray = {30,-4,22,12,20};
        int value = 22;
        assertEquals("The midpoint value of this array is at index : ", 2,BinarySearch.binarySearch(inputArray, value));
    }
}


