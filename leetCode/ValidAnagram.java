package leetCode;
import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first string
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();

        // Read the second string
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        // Create an instance of Solution and call isAnagram
        ValidAnagram va = new ValidAnagram();
        boolean result = va.isAnagram(s, t);

        // Print the result
        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

}
