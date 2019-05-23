package Algorithms;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public final class JavaAPISort implements ISortingAlgorithm {
    public void sort(int[] toBeSorted){
        Arrays.sort(toBeSorted);
    }

    public void sortReverse(int[] toBeSorted){
        throw new NotImplementedException();
    }
}
