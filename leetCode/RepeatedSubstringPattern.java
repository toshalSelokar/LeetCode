package leetCode;

/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.


Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
 */


import java.util.*;

public class RepeatedSubstringPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String s = sc.next();

        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {

        Map<Character, Integer> dict = new HashMap<>();

        char[] str = s.toCharArray();

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {



        }

        return false;
    }




}
