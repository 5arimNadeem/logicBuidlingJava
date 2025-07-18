package logicBuilding.EasyProblems;

class SolutionNine {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for(int numberInArray: nums){
            elementSum += numberInArray;

            int tempNumber = numberInArray;

            while (tempNumber > 0) {
                int currentDigit = tempNumber % 10;
                digitSum += currentDigit;
                tempNumber /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}