package logicBuilding.IntermediateProblems;

import java.util.HashMap;
import java.util.Map;

public class FruitsInBasket {

    public static int fruitsInBasket(int[] fruits , int k){
        int left = 0, right = 0, maxLength = 0;
        Map<Integer , Integer> map = new HashMap<>();

        for(right = 0; right < fruits.length; right++){
            int currentFruitCount = map.getOrDefault(fruits[right], 0);
            map.put(fruits[right],currentFruitCount + 1);

            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left]) - 1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength , right - left + 1);
        }


        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {23,4,1,24,5,1,1,1,1};
        System.out.println("The maxNumber of fruits are : " + fruitsInBasket(fruits,1));
    }
}
