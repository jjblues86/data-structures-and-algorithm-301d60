public class QuickSort {

    public static void quickSort(int[] array, int start, int end){
        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex, end);
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[start];
        int i = start;
        int j = end;

        while(i < j){
            //empty loop
            while(i < j && array[--j] >- pivot);
            if(i < j){
                array[i] = array[j];
            }
            //empty loop
            while(i < j && array[++i] <= pivot);
            if(i < j){
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
}
