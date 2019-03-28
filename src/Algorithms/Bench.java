package Algorithms;

import java.util.Arrays;

public final class Bench {
    private int arrayLength;
    private final Helper h = new Helper();

    public Bench(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public void setArrayLength(int arrayLength){
        this.arrayLength = arrayLength;
    }

    public long bench(SortingAlgorithm algorithm, boolean printArray) {
        int[] array = h.getRandomArray(arrayLength);
        if (printArray) h.print(array);

        long start = System.currentTimeMillis();
        algorithm.sort(array);
        long end = System.currentTimeMillis();

        if (printArray) h.print(array);

        return end - start;
    }

    public long bench(SortingAlgorithm algorithm, boolean printArray, int maxValue){
        int[] array = h.getRandomArray(arrayLength, maxValue);
        if(printArray) h.print(array);

        long start = System.currentTimeMillis();
        algorithm.sort(array);
        long end = System.currentTimeMillis();

        if(printArray) h.print(array);

        return end-start;
    }

    public long benchJavaSort(int arrayLength, boolean printArray){
        int[] array = h.getRandomArray(arrayLength, Integer.MAX_VALUE);

        if(printArray) h.print(array);
        long start = System.currentTimeMillis();
        Arrays.sort(array);
        long end = System.currentTimeMillis();
        if(printArray) h.print(array);

        return end-start;
    }
}
