package leetCode;

/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */


import java.util.Scanner;

public class MergeStringAlternately {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Word 1: ");
        String word1 = sc.next();



        System.out.print("Word 2: ");
        String word2 = sc.next();


        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        // Determine the length of the shorter string
        //to avoid out of bound exception if used longer length
        final int n = Math.min(word1.length(), word2.length());

        // StringBuilder to construct the result
        StringBuilder sb = new StringBuilder();

        // Append alternating characters from both strings
        for (int i = 0; i < n; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        // Append the remaining characters from the longer string using substring function
        // converting the string builder to string usinng toString()
        // Here sb is already have the alterbate alphabets from two strings. We are appending sb with the remaining character from the larger string whichever it may be 1 or 2.
        return sb.append(word1.substring(n)).append(word2.substring(n)).toString();



    }

}
