package logicBuilding.LibraryManagmentSystem;

import logicBuilding.LibraryManagmentSystem.LibEventController;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class LibManagementSystem {
    public static void main(String[] args) {
        LibEventController controller = new LibEventController();
        controller.start();
    }
}