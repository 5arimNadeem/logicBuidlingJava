package OOP.SimpleTodo_App.MainMenu;

import java.util.Scanner;

import OOP.SimpleTodo_App.Controllers.Controllers;

public class Menu {
    public void showMenu() {
        System.out.println("==== Simple Todo App ====");
        System.out.println("1. Create");
        System.out.println("2. Delete");
        System.out.println("3. Edit");
        System.out.println("4. List Items");
        System.out.println("5. Exit");
        System.out.print("Select an option: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Controllers controllers = new Controllers();
        Menu menu = new Menu();

        switch (choice) {
            case 1:
                System.out.println("Create selected.");
                // Call create method here
                controllers.createItem();
                menu.showMenu();

                
            case 2:
                System.out.println("Delete selected.");
                // Call delete method here
                controllers.deleteItem();
                menu.showMenu();
                
            case 3:
                System.out.println("Edit selected.");
                // Call edit method here
                controllers.editItem();
                menu.showMenu();
                
            case 4:
                System.out.println("List Items selected.");
                // Call list method here
                controllers.viewItems();
                menu.showMenu();

            case 5: 
                System.out.println("Exiting the application. Goodbye!");
                scanner.close();
                return; // Exit the application    
                
            default:
                System.out.println("Invalid option.");
        }
    }
}
