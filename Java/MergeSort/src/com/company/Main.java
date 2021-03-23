package com.company;

import java.util.Arrays;

public class Main {

//    public static void merge(int[] A, int p, int q, int r) {
//
//        int n1 = q - p + 1;
//        int n2 = r - q;
//
//        int[] L = new int[n1 + 1];
//        int[] R = new int[n2 + 1];
//
//        for(int i = 0; i < n1; i++) {
//            L[i] = A[p + i];
//        }
//        for(int j = 0; j < n2; j++) {
//            R[j] = A[q + j + 1];
//        }
//
//        L[n1] = Integer.MAX_VALUE;
//        R[n2] = Integer.MAX_VALUE;
//
//        int i = 0;
//        int j = 0;
//
//        for(int k = p; k <= r; k++) {
//            if(L[i] <= R[j]) {
//                A[k] = L[i];
//                i = i + 1;
//            } else {
//                A[k] = R[j];
//                j = j + 1;
//            }
//        }
//    }


    public static void stringMerge(String[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        String[] L = new String[n1 + 1];
        String[] R = new String[n2 + 1];

        for(int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for(int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }

        L[n1] = "null";
        R[n2] = "null";

        int i = 0;
        int j = 0;

        for(int k = p; k <= r; k++) {
            if(L[i].compareTo(R[j]) <= 0) {
                A[k] = L[i];
                i = i + 1;
            } else {
                A[k] = R[j];
                j = j + 1;
            }
        }
    }

    public static void stringMergeSort(String[] A, int p, int r) {
        if(p < r) {
            int q = (p + r)/2;
            stringMergeSort(A, p, q);
            stringMergeSort(A, q + 1, r);
            stringMerge(A, p, q, r);
        }
    }
    
//    public static void mergeSort(int[] A, int p, int r) {
//        if(p < r) {
//            int q = (p + r)/2;
//            mergeSort(A, p, q);
//            mergeSort(A, q + 1, r);
//            merge(A, p, q, r);
//        }
//    }


    public static void main(String[] args) {
	// write your code here
//        int[] numbers = {2, 5, 10, 17, 3, 33, 11, 28};
//        mergeSort(numbers, 0, numbers.length-1);
//        System.out.println(Arrays.toString(numbers));

        String word = "mergesort";
        String[] letters = word.split("");
        stringMergeSort(letters, 0, letters.length-1);
        System.out.println(Arrays.toString(letters));



    }
}
