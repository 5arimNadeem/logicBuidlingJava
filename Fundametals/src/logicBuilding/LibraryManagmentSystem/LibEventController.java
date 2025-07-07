package logicBuilding.LibraryManagmentSystem;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LibEventController {

    public void start() {
        System.out.println("Welcome to the Library Management System!");
        System.out.println("Please select an option:");
        System.out.println("1. Add a new book");
        System.out.println("2. View all books");
        System.out.println("3. Search for a book");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                bookList();
                break;
            case 3:
                searchBook();
                break;
            case 4:
                System.out.println("Exiting the system. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                start();
        }
    }

    Scanner scanner = new Scanner(System.in);
    private ArrayList<String> books = new ArrayList<>();

    private void addBook() {
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        if (title.trim().isEmpty()) {
            System.out.println("Book title cannot be empty.");
        } else {
            books.add(title);
            System.out.println("Book added successfully!");
        }
        start();
    }

    private void bookList() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
        start();
    }

    private void searchBook() {
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter the book title to search: ");
        String query = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (String book : books) {
            if (book.toLowerCase().contains(query)) {
                System.out.println("Found: " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
        start();
    }

}
