package logicBuilding.EasyProblems;

public class SolutionSixteen {
    public int findNumbers(int[] nums) { // Renamed 'n' to 'nums' for clarity
        // 1. Initialize a counter to keep track of our findings
        int evenDigitCount = 0;

        for (int number : nums) {
            int digitCount = numberCount(number);
            boolean hasEvenDigits = hasEvenDigitCount(digitCount);

            // 2. If the number has an even number of digits, increment our counter
            if (hasEvenDigits) {
                evenDigitCount++;
            }
        }

        // 3. Return the final count, not a hardcoded value
        return evenDigitCount;
    }

    private boolean hasEvenDigitCount(int digitCount) {
        return digitCount % 2 == 0;
    }

    private int numberCount(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;

    }


    public static void main(String[] args) {
        SolutionSixteen countOfEven = new SolutionSixteen();
        int[] array = {23,4,2,1,444,5,1221};
        var numCount = countOfEven.findNumbers(array);
        System.out.println(numCount);
    }
}
