package logicBuilding.EasyProblems.twoPointer;

import java.util.HashMap;

public class EasyOne {
//    public static int[] sumOfTwoPairs(int[] pairSum , int targetSum){
//        int left = 0 , right = pairSum.length - 1;
//
//        while(left < right){
//            int currentSum = pairSum[left] + pairSum[right];
//            if(pairSum[left] == pairSum[right]){
//                return new int[]{left, right};
//            }
//            if (targetSum < currentSum) {
//                left++;
//            }else{
//                right--;
//            }
//        }
//
//        return new int [] {-1 , -1};
//    }

//    improving complexity by using hashmap
    public static int[] sumofTwoPairs(int[] pairSum, int targetSum){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < pairSum.length ; i++) {
            if(map.containsKey(targetSum - pairSum[i])){
                return new int[]{ map.get(targetSum - pairSum[i]), i};
            }else{
                map.put(pairSum[i] , i);
            }
        }

        return new int[] {-1 , - 1};
    }
}
