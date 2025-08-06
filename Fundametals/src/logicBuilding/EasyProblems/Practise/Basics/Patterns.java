package logicBuilding.EasyProblems.Practise.Basics;

public class Patterns {

    public static void triangle_pattern(int n){
        for(int i = 0 ; i <= n;  i++){
//            int space = 23333333;
            System.out.println("  ");
            for(int j = 0; j <= i ; j++){
                System.out.print(" * ");
            }
        }
//        System.out.println();
    }
    public static void main(String[] args) {
        triangle_pattern(7);
    }
}
