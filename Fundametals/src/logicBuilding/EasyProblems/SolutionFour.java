package logicBuilding.EasyProblems;

class SolutionFour {
    public boolean checkIfPangram(String sentence) {
        String sentenceToLowerCase = sentence.toLowerCase();

        int [] count = new int[26];

        for(char ch:sentenceToLowerCase.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                int index = ch - 'a';
                count[index] = 1;
            }
        }

        for(int i = 0; i < 26; i++){
            if (count[i] == 0) { // If any letter's count is 0, it means it was missing
                return false; // Not a pangram
            }
        }
        return true;
    }
}