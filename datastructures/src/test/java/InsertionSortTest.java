import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    InsertionSort insertionSort;

    @Test public void setInsertionSort(){
        int[] intArray = new int[]{25,45,-5,8,15,-12};
        int[] expected = new int[]{-12,-5,8,15,25,45};
        assertArrayEquals(expected, InsertionSort.sortInsertion(intArray));
    }

    @Test public void emptyInsertionSort(){
        int[] intArray = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, InsertionSort.sortInsertion(intArray));
    }

    @Test public void negativeValuesInsertionSort(){
        int[] intArray = new int[]{-25,-45,-5,-8,-15,-12};
        int[] expected = new int[]{-45,-25,-15,-12,-8,-5};
        assertArrayEquals(expected, InsertionSort.sortInsertion(intArray));
    }

}