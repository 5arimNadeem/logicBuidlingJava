package grokkingCodingRounds.slidingWindowQuestions;
// the optimized solution
public class SlidingWindowOneEasy {

    public static int findMaxSumSubArray(int k , int [] arr){
        int maxSum = 0 , windowSum = 0, windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if(windowEnd >= k - 1){
                maxSum = Math.max(maxSum,windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
