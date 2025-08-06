package DSA.sortingAlgo.insertionSort;

import java.util.Arrays;

import static DSA.sortingAlgo.selectionSort.SelectionSort.swap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23,4,1,2,4,1,3,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swwp(int[] arr , int j , int jMinusOne){

        int temp = arr[j];
        arr[j] = arr[jMinusOne];
        arr[jMinusOne] = temp;

    }
    static void insertion(int arr[]){
        for(int i = 0 ; i < arr.length - 1 ; i ++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] < arr[j - 1]){
                    swwp(arr, j ,j - 1);
                }else{
                    break;
                }
            }
        }
    }
}
