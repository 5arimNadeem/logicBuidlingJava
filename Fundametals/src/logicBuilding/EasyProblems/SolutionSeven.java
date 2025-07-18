package logicBuilding.EasyProblems;

class SolutionSeven {
    public String firstPalindrome(String[] words) {

        for (String word : words) {
            boolean isPalindrome = true;
            int left = 0;
            int right = word.length() - 1;

            while(left < right){
                if(word.charAt(left) !=  word.charAt(right)){
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome){
                return word;
            }
        }
        return "";
    }
}