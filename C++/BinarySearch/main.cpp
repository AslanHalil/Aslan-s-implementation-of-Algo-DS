#include <iostream>

int binarySearch(int array[], int key, int low, int high) {
    int middle;

    if (low > high) {
        return -1;
    }

    middle = (low + high)/2;

    if (array[middle] == key) {
        return middle;
    }

    if (array[middle] > key) {
        return binarySearch(array, key, low, middle-1);
    } else {
        return binarySearch(array, key, middle + 1, high);
    }

}


int main() {

    int numbers[] = {1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13};
    std::cout << binarySearch(numbers, 11, 0, sizeof(numbers));

}
