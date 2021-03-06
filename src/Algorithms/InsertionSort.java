package Algorithms;

import Helper.Helper;

public final class InsertionSort implements ISortingAlgorithm {
    private final Helper h = new Helper();

    public void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(array[j] > array[j+1]){
                    h.swap(array, j, j+1);
                }
            }
        }
    }

    public void sortReverse(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(array[j] < array[j+1]){
                    h.swap(array, j, j+1);
                }
            }
        }
    }
}
