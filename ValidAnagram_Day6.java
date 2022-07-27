import java.util.Arrays;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/
public class ValidAnagram_Day7 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public static boolean isAnagram(String s, String t) {
        int[] check = new int[26];
        for (char cc : s.toCharArray()) {
            check[cc - 'a']++;
        }
        for (char cc : t.toCharArray()) {
            check[cc - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (check[i] != 0)
                return false;
        }
        return true;
    }



    // Time Complexity : O(n log(n))
    // Space Complexity: O(1)
    // private static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;
    // return sort(s).equals(sort(t));
    // }

    // private static String sort(String s) {
    // char[] sca = s.toCharArray();
    // Arrays.sort(sca);
    // return new String(sca);
    // }

}
