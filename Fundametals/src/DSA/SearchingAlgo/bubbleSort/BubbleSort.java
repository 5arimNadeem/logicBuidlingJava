package DSA.SearchingAlgo.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        BubbleSort bubb = new BubbleSort();
        int array[] = {23,4,5,5,66,6,1};
        bubble(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubble(int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - 1; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
