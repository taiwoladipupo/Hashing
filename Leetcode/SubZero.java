package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubZero {
    /*
        find if a ssubarray with a sum equal to zero exists
        we willv implement a hashMap to store the sum as Key, i as value
        traverse through the array
            we check for three conditions:
                    if there is  0 in the arr
                    if the sum == 0
                    if the  value != null
     */

    public static boolean findSubZero(int [] arr){
        //implement a Hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum +=arr[i];

            if (arr[i] == 0 || sum == 0 || map.get(sum)!= null){
                return true;
            }
            else {
                map.put(sum, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, -7, 3, 12, 9};
        System.out.println(findSubZero(arr));
    }
}
