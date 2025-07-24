package logicBuilding.EasyProblems;

public class SolutionTwentyOne {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while(n > 0){
            int moduloValue = n % 10;
            sum += moduloValue;
            product *= moduloValue;
            n /= 10;
        }

        return product - sum;
    }
}