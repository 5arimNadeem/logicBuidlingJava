package logicBuilding.EasyProblems;

public class SolutionEleven {
    public int xorOperation(int n, int start) {
        int resultXOR = 0;

        for (int i = 0; i < n; i++){
            int currentNum = start + 2 * i;
            resultXOR ^= currentNum;
        }

        return resultXOR;
    }
}