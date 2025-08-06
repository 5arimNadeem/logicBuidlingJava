package DSA.sortingAlgo.selectionSort;

public class PractiseSS {

    public static void letsSort(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            int lastElement = arr.length - i - 1;

            int findMaxIndexOfLargestElement = findMaxIndex(arr,0,lastElement);

            swap(arr,findMaxIndexOfLargestElement,lastElement);
        }

    }
    public static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int findMaxIndex(int[] arr, int start , int end){
        int max = start;

        for(int i = 0 ; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i ;
            }
        }

        return max;
    }
}
