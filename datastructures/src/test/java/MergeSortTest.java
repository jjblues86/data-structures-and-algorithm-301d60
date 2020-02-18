import org.junit.Test;
import static org.junit.Assert.*;


public class MergeSortTest {

    MergeSort mergeSort;

    @Test public void testMergeSort(){
        int[] intArray = new int[]{25,45,-5,8,15,-12};
        int[] expected = new int[]{-12,-5,8,15,25,45};
        assertArrayEquals(expected, MergeSort.mergeSort(intArray, 0, intArray.length));
    }

    @Test public void testEmptyMergeSort(){
        int[] intArray = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, MergeSort.mergeSort(intArray, 0, intArray.length));
    }
}
