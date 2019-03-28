package Algorithms;

import java.util.Random;

public final class InsertionSort implements SortingAlgorithm{
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

    private void sortDESC(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(array[j] < array[j+1]){
                    h.swap(array, j, j+1);
                }
            }
        }
    }
}
