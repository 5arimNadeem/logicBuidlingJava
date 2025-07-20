package logicBuilding.EasyProblems;

public class SolutionThirteen {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i <= s.length() - 1; i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }

        return result.toString();
    }
}