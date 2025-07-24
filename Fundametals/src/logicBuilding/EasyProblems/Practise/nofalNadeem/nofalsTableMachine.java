package logicBuilding.EasyProblems.Practise.nofalNadeem;

import java.util.Scanner;

public class nofalsTableMachine {

    public static int scanner(Scanner sc){
        int num = sc.nextInt();
        return num;
    }

    public static String[] statements(){
        return new String[]{"Give me the data: ", "Table number: ", "Where do you want to start the table from : ", "Where do you want to end the table at : "};
    }

    public static void main(String[] args) {

        System.out.println("How many tables you want to print : ");
        int numberOfRounds = scanner(new Scanner(System.in));

        for (int i = 1; i <= numberOfRounds; i++) {

            System.out.println(statements()[0]);

            System.out.print(statements()[1]);
            int tableNumber = scanner(new Scanner(System.in));

            System.out.print(statements()[2]);
            int fromWhere = scanner(new Scanner(System.in));

            System.out.print(statements()[3]);
            int tillHere = scanner(new Scanner(System.in));

            System.out.println();

            if (tillHere > fromWhere) {
                for (int tableDigitVAlue = fromWhere; tableDigitVAlue <= tillHere; tableDigitVAlue++) {
                    System.out.println(tableNumber + " x " + tableDigitVAlue + " = " + tableNumber * tableDigitVAlue);
                }
            } else {
                System.out.println("Error !!!!!!");
            }
        }

    }
}