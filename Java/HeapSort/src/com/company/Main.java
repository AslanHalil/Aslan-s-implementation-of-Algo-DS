package com.company;

import java.util.Arrays;

public class Main {


    public static void heapSort(int[] A) {
        int heapSize = A.length - 1;
        build_max_heap(A);
        for(int i = A.length - 1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            heapSize--;
            max_heapify(A, 0, heapSize);
        }
    }

    public static void max_heapify(int[] A, int i, int heapSize) {
        int l = 2*i;
        int r = 2*i+1;
        int largest = 0;
        if(l <= heapSize && A[l] > A[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if(r <= heapSize && A[r] > A[largest]) {
            largest = r;
        }
        if(largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            max_heapify(A, largest, heapSize);
        }
    }

    public static void build_max_heap(int[] A) {
        int heapSize = A.length - 1;
        for(int i = A.length/2; i >= 0; i--) {
            max_heapify(A, i, heapSize);
        }
    }


    public static void main(String[] args) {

        int[] numbers = {1, 10, 5, 21, 8, 23, 15};
        heapSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
