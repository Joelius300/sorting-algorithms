package Algorithms;

import Helper.Helper;

public final class BubbleSort implements ISortingAlgorithm {
    private final Helper h = new Helper();

    public void sort(int[] toBeSorted){
        boolean somethingSwapped;

        for (int i = 0; i < toBeSorted.length; i++) {
            somethingSwapped = false;
            for (int j = 0; j < toBeSorted.length - i - 1; j++) {
                if (toBeSorted[j] > toBeSorted[j + 1]) {
                    h.swap(toBeSorted, j, j + 1);
                    somethingSwapped = true;
                }
            }

            if(!somethingSwapped) break;
        }
    }
}
