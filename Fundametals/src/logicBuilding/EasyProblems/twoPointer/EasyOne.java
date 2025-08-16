package logicBuilding.EasyProblems.twoPointer;

public class EasyOne {
    public static int[] sumOfTwoPairs(int[] pairSum , int targetSum){
        int left = 0 , right = pairSum.length - 1;

        while(left < right){
            int currentSum = pairSum[left] + pairSum[right];
            if(pairSum[left] == pairSum[right]){
                return new int[]{left, right};
            }
            if (targetSum < currentSum) {
                left++;
            }else{
                right--;
            }
        }

        return new int [] {-1 , -1};
    }
}
