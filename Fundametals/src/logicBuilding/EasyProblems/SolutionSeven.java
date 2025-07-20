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

    public static class SolutionEleven {
        public int xorOperation(int n, int start) {
            int resultXOR = 0;

            for (int i = 0; i < n; i++){
                int currentNum = start + 2 * i;
                resultXOR ^= currentNum;
            }

            return resultXOR;
        }
    }
}