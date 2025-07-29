package DSA.sortingAlgo.cyclicSort;

import java.util.Arrays;

import static DSA.sortingAlgo.selectionSort.SelectionSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }else{
                i++;
            }
        }
    }
}
