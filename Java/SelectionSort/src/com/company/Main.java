package com.company;

import java.util.Arrays;

public class Main {

/*
    A straight forward implementation of Selection Sort only using the standard library, the code
    was taken from the book Algorithms I 4th ed. - Robert Sedgewick, Kevin Wayne,
    and adapted to make it more simple to read rather than dividing the algoriths into smaller functions with distinct uses.
    No comparison function or swap function.
 */


    public static String[] selectionSort(String[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            String temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }


    public static void main(String[] args) {
	// write your code here
        String word = "sortexample";
        String[] letters = word.split("");
        selectionSort(letters);
        System.out.println(Arrays.toString(letters));

    }
}
