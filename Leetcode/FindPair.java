package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindPair {
    /*
        find pair in an array such that a + b = c + d
        we need to return the pair
        we will implement a hashMap that takes the key as SUm, and pair aas values
        we will traverse the array
            for each element in the array:
                for the next element in the array :
                    we will create a sum variable
                    then we will check if the map does not contain the sum(key)
                        if this condition is satisfied, we will put it in map
                        otherwise we will append it to the result
                        Time complexity -> O(n^2)
     */

    public static String findPair(int [] arr){
        //implement a map
        Map<Integer, int[]>map = new HashMap<>();
        //create an empty string
        String res = "";
        //traverse through the array
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                //create a sum variable
                int sum = arr[i] + arr[j];
                //check if map does not contain the sum(key)
                if (!map.containsKey(sum)){
                    //add it to the map
                    map.put(sum, new int[]{arr[i], arr[j]});
                }else {
                    //create a prev_val variable
                    int [] prev_val = map.get(sum);
                    //append it to result
                    res += "{" + prev_val[0]  + "," + prev_val[1] + "} {" + arr[i] + "," + arr[j]+ "}" ;
                        return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 12, 9};
        System.out.println(findPair(arr));
    }
}
