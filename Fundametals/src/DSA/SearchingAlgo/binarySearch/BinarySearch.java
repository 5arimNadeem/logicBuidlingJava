package DSA.SearchingAlgo.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {1,2,4,34,56,78,88};
        int bsStored = bs.searchInSortedArr(array,56);
        System.out.println(bsStored);
    }

    public int searchInSortedArr(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1 ;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
