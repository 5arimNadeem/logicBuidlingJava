package DSA.arraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        change(arr);

        System.out.println(Arrays.toString(arr));

//        System.out.println(arr.length);
    }
    static void change(int[] arrays){
        arrays[0] = 9;
    }
}
