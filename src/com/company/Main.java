package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(divide(3));
        System.out.println(divide(7));
        System.out.println(divide(21));
        System.out.println(divide(4));

        System.out.println(Arrays.toString(addToArray(new int[]{4, 7, 1, 9}, 3)));
       int n=50;
        System.out.println( "Odd number form 1 to" +n+ " are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
        }
    }

    public static boolean divide(int a) {
        if (a % 3 == 0 && a % 7 != 0) {
            return true;
        } else if (a % 7 != 0 && a % 3 != 0) {
            return true;
        } else {
            return false;
        }

    }


    public static int[] addToArray(int[] array, int x) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + x;
        }
        return array;
    }

    public static void oodNumber(int n) {

    }

}