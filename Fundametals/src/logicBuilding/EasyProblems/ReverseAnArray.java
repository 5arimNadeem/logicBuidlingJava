package logicBuilding.EasyProblems;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        String[] names = {"sarim", "naeem", "ahmad"};

        for (int i = 0; i < names.length/ 2; i++) {
            String temp = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(names));

        int[] numbers = {23,4,1,12,3};
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i -1] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
