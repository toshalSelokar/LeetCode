package leetCode.Array;

/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

 */


import java.sql.SQLOutput;
import java.util.Scanner;

public class CanPlaceFlowerbed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int l = sc.nextInt();

        int[] flowerbed = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.print(i+" index: ");
            flowerbed[i] = sc.nextInt();
        }

        System.out.print("New plants to be planted: ");
        int n = sc.nextInt();
        System.out.println(canPlaceFlowers(flowerbed, n, l));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n, int l) {
        int count =1;
        int res = 0;

        for(int i =0; i<flowerbed.length;i++){

            if(flowerbed[i]==0){
                count++;
            } else{
                res = res + (count-1)/2;
                count = 0;
            }


        }
        if(count!=0){
            res = res+ count/2;
        }

        return res>=n;
    }

}
