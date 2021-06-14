package com.company;

import java.util.Arrays;

public class test {


    public static void main(String[] args) throws InterruptedException {

        System.out.println(odd(50));

        int[] a = new int[]{15,58,69,52,45,1,7,5,6,8,95,1025};
        int[] b = {5, 8, 69, 5, 4};

        System.out.println(Arrays.toString (sort(a)));


    }

    public static String odd(int n) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                Thread.sleep(750);
                System.out.println(i + " ");
            }
        }
        return "Odd number form 1 to " + n + " are: ";
    }

    public static int[] sort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        }
        return a;
    }
}
