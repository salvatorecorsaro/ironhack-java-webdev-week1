package com.day_2;


import java.util.Arrays;


public class Loops {
    public static void main(String[] args) {
        System.out.println("Introduction to loops:");
        int [] array = {5, 4, 3,2,1};


        System.out.println("=== Starting Array ===");
        System.out.println(Arrays.toString(array));

        System.out.println("=== Multiplied Array ===");
        System.out.println(Arrays.toString(multiplyArray(array)));

        System.out.println("=== Inverted Array ===");
        System.out.println(Arrays.toString(invertArray(array)));

    }

    private static void printArray(int[] test) {
        for (int item : test) {
            System.out.println(item);
        }
    }

    public static int[] multiplyArray(int[] array){
        int firstItem = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (i == array.length - 1){
                array[i] *= firstItem;
                continue;
            }
            array[i] *= array[i + 1];
        }

        return array;
    }

    public static int[] invertArray(int[] array){
        int j = 0;
        int[] ret = new int[array.length];

        for (int i = array.length -1; i >= 0; i--)
            ret[j++] = array[i];
        return ret;
    }

}
