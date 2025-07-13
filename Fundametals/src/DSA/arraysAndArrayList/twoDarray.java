package DSA.arraysAndArrayList;

import java.util.Arrays;

public class twoDarray {

    public static void main(String[] args) {

        int[][] arr = {
                {23,3,1},
                {3,3,4},
                {1,2,4}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
