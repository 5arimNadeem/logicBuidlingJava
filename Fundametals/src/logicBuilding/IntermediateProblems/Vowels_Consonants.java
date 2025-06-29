package logicBuilding.IntermediateProblems;

import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {

        int v = 0, cn = 0;

        String name = "Globalization";

        name = name.toLowerCase();
        int n = name.length();

        for(int i = 0; i < n; i++) {
           char c = name.charAt(i);

           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                v++;
           }else{
               cn++;
           }
        }

        System.out.println("Vowels in a word: " + v);
        System.out.println("Consonants in a word: " + cn);

    }
}