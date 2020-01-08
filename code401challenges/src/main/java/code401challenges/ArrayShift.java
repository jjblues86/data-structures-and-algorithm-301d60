package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args){
        int[] arrInput = new int[] {3,7,9,11};

        System.out.println(Arrays.toString(insertShiftArray(arrInput, 5)));

    }

    public static int[] insertShiftArray(int[] shiftArray, int numAdd){
        int[] newArray = new int[shiftArray.length + 1];
        //this divides the array length to determine the middle index
        int middleIndex = shiftArray.length/2;
        //loop through the array starting at the middle index
        int i;
        for(i = 0; i < middleIndex; i++){
            //assigning the old elements of the 1st array to the new array
            newArray[i] = shiftArray[i];
        }
            newArray[middleIndex] = numAdd;
        int j;
        for(j = middleIndex + 1; j <= shiftArray.length; j++){
            newArray[j] = shiftArray[j - 1];
        }
        return newArray;

    }

}
