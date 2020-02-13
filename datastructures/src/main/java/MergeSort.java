public class MergeSort {

    private static int[] mergeSort(int[] array, int start, int end){

        if(end - start < 2){
//            return;
        }

        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);

        return array;
    }

    private static int[] merge(int[] array, int start,int mid, int end){

        if(array[mid - 1] <= array[mid]) {
//            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        return array;

    }


    public static void merging(int[] array){
        int number = array.length;
//        int[] temp = new int[number];
        mergeSort(array, 0, number);
    }

//    private static int[] merge(int[] array, int i, int length) {
//        return merging(array);
//    }

//    private static int[] merge(int[] arr, int i, int length) {
//    }

}

