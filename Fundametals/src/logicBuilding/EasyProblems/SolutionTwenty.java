package logicBuilding.EasyProblems;

public class SolutionTwenty {
    public int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;

        for(int person[] : accounts){
            int sum = 0;

            for(int personAcc: person){
                sum += personAcc;
            }

            if( sum > ans ){
                ans = sum;
            }
        }

        return ans ;
    }
}