package DSA.arraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayML {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiAL = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            multiAL.add(new ArrayList<>());
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                multiAL.get(row).add(in.nextInt());
            }
        }
        System.out.println(multiAL);
    }
}
