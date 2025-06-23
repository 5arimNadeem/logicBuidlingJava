package logicBuilding.IntermediateProblems;

public class GreaterNumberInArray {
    public static void main(String[] args) {
        int arr[]= {2,4,5};

        if(arr.length == 0) System.out.println("Array is empty");

//        else if(arr.length > 0){
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
                if(arr[0] == arr[1] && arr[0]== arr[2]){
                    System.out.println("The numbers are equal");
                } else if(arr[0] > arr[1] && arr[0] > arr[2]){
                    System.out.println(arr[0] + " is greateest number");
                } else{
                    System.out.println("There is no greater number");
                }
//            }
//        }
    }
}
