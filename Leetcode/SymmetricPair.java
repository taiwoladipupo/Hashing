package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
    a pai is said to be symmetric :
        if the key of a pair is equal to the value of another pair and vice versa
        i.e (a, b) & (c, d)
        a = d, b = c
        -> we will create an empty hashMap
        -> traverse through the given arr
        -> look for second element of each pair in the arr i.e (1,2 )look fore key 2 in map
        -> if found then store it in the result arrray
        -> otherwise insert pair into hash
 */
public class SymmetricPair {
      public static String findSymmetric(int [] [] arr){
          Map<Integer, Integer> map = new HashMap<>();
          //return string
          String result = "";
          //travrss through
          for (int i = 0; i < arr.length; i++){
              //create a variable for the first and second element in a pair
              int first = arr[i][0];
              int second = arr[i][1];

              //create a variable for the Value
              Integer value = map.get(second);
              //looking for second elemnt of each pair in the map
              //so we are looking for a key that is the same elemnt as value
              if (value != null && value == first){
                  //add it to the return string
                  result += "{" + String.valueOf(second) + "," + String.valueOf(first) + "}";
              }else {
                  map.put(first, second);
              }
          }
          return result;
      }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
        String symmetric = findSymmetric(arr);
        System.out.println(symmetric);
    }
}
