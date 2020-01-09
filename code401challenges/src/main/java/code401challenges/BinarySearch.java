package code401challenges;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary");
    }

    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length;

        //Validate that start is less than end
        while (start < end) {
            //this lets you start from the mid-point of the array
            int midPoint = (start + end) / 2;
            if (array[midPoint] == value) {
                return midPoint;
            } else if (array[midPoint] < value) {
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }
        return -1;
    }
}
