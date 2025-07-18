package logicBuilding.EasyProblems;

class SolutionEight {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int employees = 0;
        for(int numberOfHours: hours){
            if(numberOfHours >= target){
                employees++;
            }
        }
        return employees;
    }
}
