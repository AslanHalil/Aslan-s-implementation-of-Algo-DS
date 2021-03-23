package com.company;

import java.util.Arrays;

/*
A straight forward implementation of Insertion Sort only using the standard library, the pseudo-code
was taken from the book Introduction to Algorithms (2009, The MIT Press) - Thomas H. Cormen, Charles E. Leiserson,
Ronald L. Rivest, Clifford Stein.
 */


public class Main {

    /*This is an Insertion Sort implementation for sorting an array of ints.
      The function takes in an int array and returns an array.
      In the book they use one-based indexing rather than zero-based indexing.*/

    static public int[] insertionSort(int[] array) {
        for(int j = 1; j < array.length; j++) { //Loop through each element of the array.
            int key = array[j]; //set key equal to 2nd element of array (Index 1 in the case of zero-based indexing). We can't use the first element because we wouldn't have anything to compare it to.
            int i = j - 1; //Create an index i equal to a previous index of j
            while (i >= 0 && array[i] > key) { //As song as i isn't the first element inside the array and element i of the array
                array[i + 1] = array[i]; // is greater than key keep moving the j element to the left of the array.
                i = i - 1; //decrement i.
            }
            array[i + 1] = key; //move key to the right of the array.
        }
        return array;
    }

    static public int[] reverseInsertionSort(int[] array) {
        for(int j = 1; j < array.length; j++) { //Loop through each element of the array.
            int key = array[j]; //set key equal to 2nd element of array (Index 1 in the case of zero-based indexing). We can't use the first element because we wouldn't have anything to compare it to.
            int i = j - 1; //Create an index i equal to a previous index of j
            while (i >= 0 && array[i] < key) { //As song as i isn't the first element inside the array and element i of the array
                array[i + 1] = array[i]; // is greater than key keep moving the j element to the left of the array.
                i = i - 1; //decrement i.
            }
            array[i + 1] = key; //move key to the right of the array.
        }
        return array;
    }

    static public String[] stringInsertionSort(String[] array) {
        for (int j = 1; j < array.length; j++) {
            String key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i].compareTo(key) > 0) { //If you want to create a reverse version you just have to set .compareTo(key) < 0
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        return array;
    }


    public static void main(String[] args) {

        int[] numbers1 = {5, 2, 4, 6, 1, 3}; //Initialize an array of int.
        int[] numbers2 = {5, 2, 4, 6, 1, 3};
        String word = "insertionsort";
        String[] letters = word.split("");

        System.out.println("Unsorted array 1: " + Arrays.toString(numbers1)); //Print out the unsorted array.
        insertionSort(numbers1); //Sort the array.
        System.out.println("Sorted array 1: " + Arrays.toString(numbers1)); //Print the sorted array.

        System.out.println("Unsorted array 2: " + Arrays.toString(numbers2));
        reverseInsertionSort(numbers2);
        System.out.println("reverse order sorted array 2: " + Arrays.toString(numbers2));

        System.out.println("Word before being sorted: " + Arrays.toString(letters));
        stringInsertionSort(letters);
        System.out.println("Word after being sorted " + Arrays.toString(letters));



    }
}
