package logicBuilding.EasyProblems;

import java.util.ArrayList;
import java.util.List;

public class SolutionSeventeen {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> resultIndices = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            String currentWord = words[i];
            for(int j = 0; j < currentWord.length(); j++){
                char currentChar = currentWord.charAt(j);

                if(currentChar == x){
                    resultIndices.add(i);
                    break;
                }

            }
        }
        return resultIndices;
    }
}
