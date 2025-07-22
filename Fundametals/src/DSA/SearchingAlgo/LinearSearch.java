package DSA.SearchingAlgo;

public class LinearSearch {


    public int FindNumberInArr(int n){

        int[] arr = {12,3,5,2,1,14};

        for (int j : arr) {
            try {
                if (j == n) {
//                System.out.println(n);
                    return n;
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }

        return -1;
    }

    public int noAtWhatIndex(int number){
        int[] nums = {23,3,45,98};

        for(int i = 0; i < nums.length; i++){
            try{
                if(nums[i] == number){
                    return i;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }

        return -1;
    }

    public int findTheMinimumValue(){

        int [] arr = {23,42,1,3,56};
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
//        LinearSearch findNum = new LinearSearch();
//        findNum.FindNumberInArr(8);
////        System.out.println(number);
//
//        LinearSearch findIndex = new LinearSearch();
//        var index = findIndex.noAtWhatIndex(9218);
//        System.out.println(index);

        LinearSearch minimumNumberInArr = new LinearSearch();
        var number = minimumNumberInArr.findTheMinimumValue();
        System.out.println(number);

    }
}
