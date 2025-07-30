package DSA.recursion;

public class Recursion {

    public static void main(String[] args) {
        recursiveFun(1);
    }

    static void recursiveFun(int n ){
        if(n == 7){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        recursiveFun(n + 1);
    }
}
