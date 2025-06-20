package logicBuilding.IntermediateProblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;

        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                counter++;
            }
        }

        if(counter == 2) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }

    }
}
