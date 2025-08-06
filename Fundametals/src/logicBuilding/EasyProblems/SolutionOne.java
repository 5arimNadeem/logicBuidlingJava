package logicBuilding.EasyProblems;

class SolutionOne {
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int sum;
        while(num > 9){
            sum = 0;
            while(num > 0){
                sum = sum + num % 10;
                num = num /10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("The final number after summing is : " + addDigits(23));
    }
}
