package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void isAnnagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return;
        }

        Map<Character, Integer>map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        //traversing through s1
        for (int i = 0; i < s1.length(); i++){

            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0) + 1);
        }

        ///traversing through s2
        for (int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        System.out.println(map.equals(map2));
    }

    public static boolean isAnagraam(String s1, String s2){
            if (s1.length() != s2.length()){
                return false;
            }
            //create a count arr of size ASCII chars
        int [] count  = new int[256];
            /*
                iterate through s1
                then add the unicode of each char of s1
                then subtract the unicode of each char of s2
             */
            for (int i = 0; i < s1.length(); i++){
                count[s1.charAt(i)]++;
                count[s2.charAt(i)]--;
            }

            //then iterate through the array
        for (int i = 0; i< count.length; i++){
            //check if an elemnt in the array != 0
            if (count[i] != 0){
                return false;
            }
        }
        return true;
    }
    //for arrays
    public static void equalArr(int [] arr1, int [] arr2){
        //create a HashMap to store the frequency count of the arr
        if (arr1.length != arr2.length){
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer>map2 = new HashMap<>();
        //hash the elements in arr1
        for (int i = 0; i < arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i],0) + 1);
        }
        //hash the elements in arr2
        for (int i = 0; i < arr1.length; i++){
            map2.put(arr2[i], map2.getOrDefault(arr2[i],0) + 1);
        }
        //return the equality value wrt to object being compared
        System.out.println(map.equals(map2));
    }
    public static void main(String[] args) {
        String s1 = "toob";
        String s2 = "tobb";
        isAnnagram(s1,s2);
        System.out.println(isAnagraam(s1,s2));

        int [] a = {1,2,1,4};
        int [] b = {2,1,4,1};
        equalArr(a,b);
    }
}
