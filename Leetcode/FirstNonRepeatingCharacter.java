package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    /*
        we can solve this using an hashMap to store the frequency of characters
            while traverse through the array:
                then we check if the map contains the current element in the arr
                    if this is true, we increment the frequency count
                    otherwise we add it to map, with a coun of 1
            then we traverse through the string
                then check if the value of the map == 1
                    if this is true, we return the character that satisfies that
                    otherwise we return cast of char (-1)
            `
     */
    public static char firstUniqueChar(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);


        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return (char) str.charAt(i);
            }
        }
        return (char) -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char res = firstUniqueChar(s);
        System.out.println(res);
    }
}
