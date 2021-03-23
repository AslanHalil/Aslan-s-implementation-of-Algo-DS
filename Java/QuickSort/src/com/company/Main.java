package com.company;

import java.util.Arrays;

public class Main {


    public static void quickSort(int[] A, int p, int r) {
        if(p < r) {
            int q = partition(A, p , r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    public static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for(int j = p; j <= r - 1; j++) {
            if(A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }


    public static void main(String[] args) {
        int[] numbers = {13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};
        quickSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
}
