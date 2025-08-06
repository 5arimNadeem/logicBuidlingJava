package logicBuilding.EasyProblems.Practise.loopWorking;

public class For {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("---------------------------------");
            System.out.println(i);
            System.out.println("---------------------------------");
            for(int j = 0; j < 2; j++){
                System.out.println(j);
            }

        }
    }
}
