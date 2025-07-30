package logicBuilding.EasyProblems.Practise.loopWorking;

public class For {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int space = i - 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println(i + " ");
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j + " ");
//            }
        }
    }
}
