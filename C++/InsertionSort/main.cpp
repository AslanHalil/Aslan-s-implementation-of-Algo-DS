#include <iostream>
#include <vector>

std::vector<int> insertionSort(std::vector<int> &array) {
    for(int j = 1; j < array.size(); j++) {
        int key = array[j];
        int i = j - 1;
        while (i >= 0 && array[i] > key) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = key;
    }
    return array;
}


int main() {

    std::vector<int> numbers = {5, 2, 4, 6, 1, 3};
    insertionSort(numbers);
    for (auto i = numbers.begin(); i != numbers.end(); i++) {
        std::cout << *i << " ";
    }

}
