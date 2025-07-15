package DSA.HashMap;

public class Hashing {
    public static void main(String[] args) {
        String name = "sam";
        var myNameHashCode = name.hashCode();
        System.out.println("The hashcode for it is : " + myNameHashCode);

        for (int i = 0; i < myNameHashCode; i++) {
            System.out.println();
        }

    }
}
