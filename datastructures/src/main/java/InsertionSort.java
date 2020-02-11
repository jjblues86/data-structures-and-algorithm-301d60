public class InsertionSort {

    public static int[] sortInsertion(int [] array){

        for(int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++){

            int newElement = array[unsortedIndex];
            int i;

            for(i = unsortedIndex; i > 0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];

            }
            array[i] = newElement;

        }
        return array;

    }
}
