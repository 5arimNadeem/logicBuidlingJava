package DSA.SearchingAlgo.binarySearch;

public class AgnosticBinarySearch {

    public int agnosticBinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] ==  target){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1 ;
                } else {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1 ;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
