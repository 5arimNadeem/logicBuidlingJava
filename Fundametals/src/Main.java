import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class grounded{
    String name;
    int age;
    String behaviour;

    grounded(String nam, int umer, String kirdar){
        this.name = nam;
        this.age = umer;
        this.behaviour = kirdar;
    }
}

public class Main {
    static Integer time(){
        System.out.println(java.time.LocalTime.now());
//        Main meet = new Main();
//        meet.meeting();
        return 0;
    }

    void meeting(){
        System.out.println("let's meet");
    }
    public static void main(String[] args) {
//        grounded obj = new grounded("arman",23,"masculine");
//        System.out.println(obj.name);
//        System.out.println(obj.age);
//        System.out.println(obj.behaviour);

        Main meet = new Main();
        meet.meeting();
        System.out.println(Main.time());
//        int[] num = {3,3,3,3,2};
//        System.out.println(Arrays.toString(num));
//        change(num);
//        System.out.println(Arrays.toString(num));
    }

//    static void change(int[] nums) {
//        nums[0] = 99;
//    }


}

