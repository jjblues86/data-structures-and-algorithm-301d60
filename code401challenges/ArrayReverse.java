import java.util.Arrays;
public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }
  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    // your code goes here!
    int[] arrayReverse = new int[inputArray.length];
    int result = 0;
    for(int i = inputArray.length - 1; i >= 0; i--){
      arrayReverse[result] = inputArray[i];
      result = result + 1;
    }
    // for now, to make sure that it compiles, here is a bad answer
    return arrayReverse;
  }
}

 // int maxIndex = inputArray.length - 1;
    // int halfLength = inputArray.length / 2;
    // for(int i = 0; i < halfLength; i++){
    //   int temp = inputArray[i];
    //   inputArray[i] = inputArray[maxIndex - i];
    //   inputArray[maxIndex - i] = temp;

    // }