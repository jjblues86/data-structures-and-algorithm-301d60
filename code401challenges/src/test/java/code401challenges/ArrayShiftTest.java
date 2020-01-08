package code401challenges;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;



public class ArrayShiftTest {
    @Test public void arrayShiftTest(){
        int[] arrayInput = new int[]{3,7,9,11,};
        int[] arrayOutput = new int[]{3,7,5,9,11};
        assertArrayEquals("these are the correct output values ", arrayOutput, ArrayShift.insertShiftArray(arrayInput, 5));
    }
    @Test public void arrayShiftTest_evenNumbers(){
        int[] arrayInput = new int[]{2,4,6,8,};
        int[] arrayOutput = new int[]{2,4,10,6,8};
        assertArrayEquals("these are the correct output values ", arrayOutput, ArrayShift.insertShiftArray(arrayInput, 10));
    }
    @Test public void arrayShiftTest_empty(){
        int[] arrayInput = new int[]{};
        int[] arrayOutput = new int[]{1};
        assertArrayEquals("these are the correct output values ", arrayOutput, ArrayShift.insertShiftArray(arrayInput, 1));
    }
}
