package Algorithms;

import Helper.Helper;

public final class SelectionSort implements ISortingAlgorithm {
    private final Helper h = new Helper();

    public void sort(int[] toBeSorted){
        for (int i = 0; i < toBeSorted.length; i++) {
            int indexLowest = i;
            for (int j = i+1; j < toBeSorted.length; j++) {
                if(toBeSorted[j] < toBeSorted[indexLowest]){
                    indexLowest = j;
                }
            }
            if(indexLowest > i){
                h.swap(toBeSorted, i, indexLowest);
            }
        }
    }

    public void sortReverse(int[] toBeSorted){
        for (int i = 0; i < toBeSorted.length; i++) {
            int indexHighest = i;
            for (int j = i+1; j < toBeSorted.length; j++) {
                if(toBeSorted[j] > toBeSorted[indexHighest]){
                    indexHighest = j;
                }
            }
            if(indexHighest > i){
                h.swap(toBeSorted, i, indexHighest);
            }
        }
    }
}
