package logicBuilding.EasyProblems.Practise.Basics;

public class TimeAndSpaceComp {

    public static void main(String[] args) {
        int[] arr = {1,3,4};
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
