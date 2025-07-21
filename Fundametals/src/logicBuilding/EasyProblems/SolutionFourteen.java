package logicBuilding.EasyProblems;

public class SolutionFourteen {
    public int countKeyChanges(String s) {
        String tolowerCase = s.toLowerCase();
        int add = 0;

        for (int i = 1; i < tolowerCase.length(); i++){
            char currentCharacter = tolowerCase.charAt(i);
            char nextCharacter = tolowerCase.charAt(i - 1);

            if(currentCharacter != nextCharacter){
                add++;
            }
        }
        return add;
    }
}