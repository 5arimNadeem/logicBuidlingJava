package milestones;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    // Custom exception for invalid email
    public static class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    // Method to validate email format
    public static boolean isValidEmail(String email) throws InvalidEmailException {
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidEmailException("Email cannot be null or empty");
        }

        // Regular expression for email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Invalid email format");
        }

        // Additional checks
        if (email.length() > 254) {
            throw new InvalidEmailException("Email is too long");
        }

        String[] parts = email.split("@");
        if (parts[0].length() > 64) {
            throw new InvalidEmailException("Local part of email is too long");
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an email address (or 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                if (isValidEmail(input)) {
                    System.out.println("Valid email address: " + input);
                }
            } catch (InvalidEmailException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Program terminated.");
    }
}