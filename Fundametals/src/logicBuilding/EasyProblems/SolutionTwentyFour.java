package logicBuilding.EasyProblems;

public class SolutionTwentyFour {
    public int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0; // If any zero exists, product is zero.
            } else if (num < 0) {
                negativeCount++; // Count negative numbers.
            }
            // Positive numbers don't affect the sign, so no 'else' needed for them.
        }

        // If negativeCount is even, product is positive.
        // If negativeCount is odd, product is negative.
        if (negativeCount % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}