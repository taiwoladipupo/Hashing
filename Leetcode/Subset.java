package Leetcode;

import java.util.HashSet;
import java.util.Set;

/*
    check if an array is a subset of another array
        it is safe to assume that both of this array are sets
        so we will implement an hashSet and store the values of the first array
        then we will iterate through the second array and
        check if the set contains the values in the second array
        if true, return true
        else false
 */
public class Subset {

    public static boolean isSubset(int [] arr1, int [] arr2){
        //implement a HashSet
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++ ){
            if (!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }

        //iterate through the second array
        for (int j = 0; j < arr2.length; j++){
            if (!set.contains(arr2[j])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 4, 7, 1, -2, 6, 5};
        int[] arr2 = {7, 1, -2};
        int[] arr3 = {10, 12};
        System.out.println(isSubset(arr1, arr2));
        System.out.println(isSubset(arr1, arr3));
    }
}
