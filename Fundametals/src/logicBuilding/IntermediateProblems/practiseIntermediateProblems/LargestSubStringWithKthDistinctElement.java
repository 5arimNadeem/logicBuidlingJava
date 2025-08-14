package logicBuilding.IntermediateProblems.practiseIntermediateProblems;

import java.util.HashMap;
import java.util.Map;


public class LargestSubStringWithKthDistinctElement {
    public static int largestSubString(String s, int k) {
        int L = 0, resultingValue = 0;
        Map<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for (int R = 0; R < n; R++) {
            char rightPointerChar = s.charAt(R);

            hm.put(rightPointerChar, hm.getOrDefault(rightPointerChar, 0) + 1);

            while (hm.size() > k) {
                char leftPointerChar = s.charAt(L);
                    hm.put(leftPointerChar, hm.get(leftPointerChar) - 1);

                    if (hm.get(leftPointerChar) == 0) {
                        hm.remove(leftPointerChar);
                    }
                    L++;
                }
            resultingValue = Math.max(resultingValue, R - L + 1);

        }
        return resultingValue;
    }

    public static void main(String[] args) {

    }
}