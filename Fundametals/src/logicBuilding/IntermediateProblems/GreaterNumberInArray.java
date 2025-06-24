package logicBuilding.IntermediateProblems;

public class GreaterNumberInArray {
    public static void main(String[] args) {
        int arr[]= {2,4,5,23,54,90};

        if(arr.length == 0) System.out.println("Array is empty");
        
        int max1;
        int max2;
        
        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }else{
            max1 = arr[1];
            max2 = arr[0];
        }
        
        for(int i = 2; i < arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
//                System.out.println(max1 = arr[i]);
            } else if (arr[i] > max2) {
                max2 = arr[i];
//                System.out.println(max2 = arr[i]);
            }
        }
    }
}