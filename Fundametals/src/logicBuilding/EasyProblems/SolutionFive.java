package logicBuilding.EasyProblems;

class SolutionFive {
    public int mostWordsFound(String[] sentences) {
        int maxNumberOfWords = 0;

        for(String sentence:sentences){
            String[] parsingSentence = sentence.trim().split("\\s+");

            int lengthOfSentence = parsingSentence.length;

            if(lengthOfSentence > maxNumberOfWords){
                maxNumberOfWords = lengthOfSentence;
            }
        }
        return maxNumberOfWords;
    }
}