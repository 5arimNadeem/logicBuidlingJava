package logicBuilding.EasyProblems.Practise.Basics;

public class Patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for(int j = 0; j < 5; j++){
                System.out.print(" * ");
            }
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
        }
        for (int i = 5; i > 0; i--) {
            System.out.println(" ");
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
        }

        System.out.println();

//        for (int i = 0; i < 3; i++) {
//            System.out.println(" ");
//            for(int j = 0; j <= i; j++){
//                System.out.print(" * ");
//                for(int k = 0; k < 1; k++){
//                    System.out.print(" ");
//                }
//            }
//        }
//        for (int i = 3; i >= 0; i--) {
//            System.out.println(" ");
//            for(int j = i; j >= 0; j--){
//                System.out.print(" * ");
//                for(int k = 0; k < 1; k++){
//                    System.out.print(" ");
//                }
//            }
//        }

//
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("*");
//            for(int j = 0; j < i + 1; j++){
//                System.out.print(" ");
//            }
//        }
    }
}
