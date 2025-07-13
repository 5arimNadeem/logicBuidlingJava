package OOP.SimpleTodo_App.Controllers;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class TodoItem {
    private String description;
    private String createdAt;

    public TodoItem(String description) {
        this.description = description;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}

public class Controllers {
    private ArrayList<TodoItem> todoList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createItem() {
        System.out.print("Enter a new todo item: ");
        String item = scanner.nextLine();
        todoList.add(new TodoItem(item));
        System.out.println("Item added.");
    }

    public void editItem() {
        viewItems();
        System.out.print("Enter the item number to edit: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < todoList.size()) {
            System.out.print("Enter the new value: ");
            String newValue = scanner.nextLine();
            todoList.get(index).setDescription(newValue);
            System.out.println("Item updated.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public void deleteItem() {
        viewItems();
        System.out.print("Enter the item number to delete: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
            System.out.println("Item deleted.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public void viewItems() {
        if (todoList.isEmpty()) {
            System.out.println("Todo list is empty.");
        } else {
            System.out.println("Todo List:");
            for (int i = 0; i < todoList.size(); i++) {
                TodoItem item = todoList.get(i);
                System.out.println((i + 1) + ". " + item.getDescription() + " (Created at: " + item.getCreatedAt() + ")");
            }
        }
    }
}
