package logicBuilding.IntermediateProblems;

import java.util.Scanner;

public class SumOfNumbers {


    public static void main(String[] args) {

        System.out.println("\nEnter a number to find the sum of its digits: ");

        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();

        long sum = 0;
        long remainder = 0;

        while(number > 0) {
            remainder = number % 10; // Get the last digit
            sum += remainder; // Add it to the sum
            number /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}