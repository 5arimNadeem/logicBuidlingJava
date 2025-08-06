package logicBuilding.EasyProblems.Practise.Basics;

public class Swap {

    public static void swapping(int a , int b){
        int temp = a ;
        a = b;
        b = temp;

        System.out.println(a + " , " + b);

    }

    public static void main(String[] args) {
        int a = 4, b = 8;
        System.out.print("Before swap: ");
        System.out.println(a + " , " + b);
        System.out.print("After swap: ");
        swapping(a,b);
    }
}
