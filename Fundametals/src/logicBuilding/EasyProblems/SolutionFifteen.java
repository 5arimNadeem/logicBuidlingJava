package logicBuilding.EasyProblems;

import java.util.Arrays;

public class SolutionFifteen {
    public String triangleType(int[] nums) {

        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c) { // IMPORTANT: Changed to '<=' because if sum is equal or less, it's not a triangle
            return "none";
        }

        if(a == b && b == c){
            return "equilateral";
        }
        else if(a == b || b == c || a == c){
            return "isosceles";
        }
        else{
            return "scalene";
        }
    }
}