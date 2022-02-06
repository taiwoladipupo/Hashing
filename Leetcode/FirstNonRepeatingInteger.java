package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingInteger {
    /*
        first we can implement a hashmap to store the frequency of integers in the arr
        we will hash the elements into the arr
            if the map contains the element we increment count
            else we add it to the map

        then we iterate the arr
            and check if the value of the element == 0
            if true return the element
            break
            return -1 if no element is found
     */

    public static int findFirstUniqueElem(int [] arr){
        int n = arr.length;
        //implement a HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
               if (map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i]) + 1);
               }else {
                   map.put(arr[i],0);
               }
        }

        for (int i = 0; i < n; i++){
            if (map.get(arr[i]) == 0){
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 54, 7, 2, 6, 54};
        int res = findFirstUniqueElem(arr);
        System.out.println(res  );
    }
}
