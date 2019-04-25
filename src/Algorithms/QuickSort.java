package Algorithms;

import Helper.Helper;

import java.util.ArrayList;

public final class QuickSort implements SortingAlgorithm{
    private final Helper h = new Helper();

    public void sort(int[] toBeSorted){
        int p = toBeSorted[toBeSorted.length -1];
        ArrayList<Integer> lower = new ArrayList<Integer>();
        ArrayList<Integer> higher = new ArrayList<Integer>();

        for (int i = 0; i < toBeSorted.length-2; i++) {
            if(toBeSorted[i] <= p) {
                lower.add(toBeSorted[i]);
            }else{
                higher.add(toBeSorted[i]);
            }
        }

        //etc
    }
}
