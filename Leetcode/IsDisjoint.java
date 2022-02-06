package Leetcode;

import com.sun.source.tree.BreakTree;

import java.util.HashSet;
import java.util.Set;

/*
    Disjoint means there are no  intersection between them,
        hence no common element between them
        we can assume that both arrays has unique elements
        then we can implement an hashset to store the values of the arr
            then we iterate through the arr2
            then check if set contains elemnts in arr2
                return false
             else return true
 */
public class IsDisjoint {
    public static boolean isDisjoint(int [] arr1, int [] arr2){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i< arr1.length; i++){
            if (!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }

        for (int j = 0; j < arr2.length;j ++){
            if (set.contains(arr2[j])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 4, 3, 1, -2, 6, 5};
        int[] arr2 = {7, 10, 8};
        int[] arr3 = {1, 12};
        System.out.println(isDisjoint(arr1, arr2));
        System.out.println(isDisjoint(arr1, arr3));

    }


}
