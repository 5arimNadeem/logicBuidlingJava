package grokkingCodingRounds.slidingWindowQuestions;

public class MinimumSizeSubArray {
    public static int findMinSubArray(int S, int[] arr){
        int windowSum = 0, minLength = Integer.MAX_VALUE , windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            while(windowSum >= S){
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
