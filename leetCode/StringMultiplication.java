package leetCode;

/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"
 */

import java.util.Scanner;

public class StringMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nums1: ");
        String num1 = sc.next();

        System.out.print("Nums2: ");
        String num2 = sc.next();

        System.out.println(multiply(num1,num2));
    }

    public static String multiply(String num1, String num2) {

        int m = num1.length();
        int n = num2.length();

        if(m==0||n==0|| "0".equals(num1)||"0".equals(num2)){
            return "0";
        }

        if("1".equals(num1)){
            return num2;
        }

        if("1".equals(num2)){
            return num1;
        }

        int[] res = new int[m+n];

        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                int prod = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');

                prod += res[i+j+1];

                res[i+j+1] = prod%10;
                res[i+j] += prod/10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int r: res){
            if(r==0 && sb.length()==0){
                continue;
            }
            sb.append(r);
        }

        return sb.toString();
    }

}
