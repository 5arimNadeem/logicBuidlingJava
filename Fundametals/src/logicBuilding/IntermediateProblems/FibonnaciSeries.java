package logicBuilding.IntermediateProblems;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1, nextNum;
        int seriesOf = 20;
        for(int i = 1; i <= seriesOf; i++) {
            System.out.print( firstNum + " ; " );

            nextNum = firstNum + secondNum;

            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
