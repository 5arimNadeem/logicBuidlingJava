package DSA.sortingAlgo.bubbleSort;

import java.util.Arrays;

public class PractiseBS {
    public static void main(String[] args) {
        int array[] = {23,1,2,4,6,88};
        System.out.println("before swapping : " + Arrays.toString(array));
        bs(array);
        System.out.println("After swapping : " + Arrays.toString(array));
    }

    public static void bs(int num[]){
        boolean isSwapped;

        for(int i = 0 ; i < num.length; i++){
            isSwapped = false;

            for(int j = 1; j < num.length - i; j++){
                if(num[j] < num[j-1]){
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
