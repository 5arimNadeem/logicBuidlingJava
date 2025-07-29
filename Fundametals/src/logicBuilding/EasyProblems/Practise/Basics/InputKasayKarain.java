package logicBuilding.EasyProblems.Practise.Basics;

import java.util.Scanner;

public class InputKasayKarain {


    /*
    * {1,2,3,4,21,3,20};
    * k = 3; k = 2;
    *
    * parameters = (k , array of integers)
    *
    * Sum = 0;
    * for(outerLoop -> [i = 0 ; i < array.length - ])
    *
    * */

    public static int MaxSumOfSubArray(int k , int [] array){
        int maxSum = 0; int Sum;

        for(int i = 0 ; i < array.length - k; i++){
            Sum = 0;
            for(int j = i ; j < i + k ; j++){
                Sum += array[j];
            }
            maxSum = Math.max(maxSum, Sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        InputKasayKarain input = new InputKasayKarain();
        System.out.println("you are good at it : " +
                input.MaxSumOfSubArray(5,new int[]{23,41,2,4,5})
        );
    }
}