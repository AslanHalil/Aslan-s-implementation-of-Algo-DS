package com.company;

import java.util.Arrays;

public class Main {

    public static int binary_search(int s[], int key, int low, int high) {
        int middle; /* index of middle element */
        if (low > high) {
            return (-1); /* key not found */
        }
        middle = (low + high) / 2;
        if (s[middle] == key) {
            return(middle);
        }
        if (s[middle] > key) {
            return(binary_search(s, key, low, middle - 1));
        } else {
            return(binary_search(s, key, middle + 1, high));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12};
        System.out.println(binary_search(numbers, 6, 0, numbers.length));
    }
}
