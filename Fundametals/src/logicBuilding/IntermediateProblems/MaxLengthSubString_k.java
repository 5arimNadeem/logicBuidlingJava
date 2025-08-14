package logicBuilding.IntermediateProblems;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthSubString_k {
    public static int findLength(String s, int k){
//        handling the edge cases here
        if(s == null || s.isEmpty() || s.length() < k)
            throw new IllegalArgumentException();


        int leftPointer = 0, maxLength = 0;
        /*
         * characterStoringInMap: This is a HashMap, which is like a digital dictionary.
         * It will store each unique character in our current window as a key and its frequency (count) as a value.
         * For example, { 'a': 2, 'r': 1 }.
         * |                                                                                  |
           |                                                                                  |
          \|/                                                                                \|/
         */
        Map <Character, Integer> characterStoringInMap  = new HashMap<>();

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {

            char rightPointerChar = s.charAt(rightPointer);
          /*
           In simple terms: The entire line says, "Look at the current character (rightPointerChar).
           Find its count in the map. If it's not there, assume the count is 0.
           Then, add 1 to that count and store the new count back in the map for that character."

            It will store each unique character in our current window as a key and its frequency (count) as a value.
         * For example, { 'a': 2, 'r': 1 }.
           |                                                                                  |
           |                                                                                  |
          \|/                                                                                \|/
          */
            characterStoringInMap.put(rightPointerChar, characterStoringInMap.getOrDefault(rightPointerChar, 0) + 1);

            while(characterStoringInMap.size() > k){

                char leftPointerChar = s.charAt(leftPointer);
                /*
                * If(characterStoringInMap.get(leftPointerChar) == 0):
                * If the count for this character drops to zero, it means it's no longer in our window,
                *  so we completely remove it from the HashMap to keep the count of unique characters accurate.

                leftPointer++: We move the leftPointer one position to the right,
                * effectively shrinking the window. The while loop will repeat this shrinking process until the window becomes valid again
                * (i.e., characterStoringInMap.size() <= k).
                *  |                                                                                  |
                   |                                                                                  |
                  \|/                                                                                \|/
                * */
                characterStoringInMap.put(leftPointerChar,characterStoringInMap.get(leftPointerChar) - 1);
                
                if(characterStoringInMap.get(leftPointerChar) == 0){
                    characterStoringInMap.remove(leftPointerChar);
                }
                leftPointer++;
            }
            /*
            * rightPointer - leftPointer + 1
            * it is the distance of the left pointer to the right pointer.
            * */
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest subsing : " + MaxLengthSubString_k.findLength("araaci", 2));
    }
}
