package Bench;

import Algorithms.ISortingAlgorithm;
import Helper.Helper;

public final class Bench {
    private final Helper h = new Helper();

    private int arrayLength = 10000;
    public void setArrayLength(int arrayLength){
        this.arrayLength = arrayLength;
    }
    public int getArrayLength(){
        return this.arrayLength;
    }

    private int maxValue = 0;
    public void setMaxValue(int maxValue){
        this.maxValue = maxValue;
    }


    public long bench(ISortingAlgorithm algorithm, boolean printArray) {
        int[] array;
        if(maxValue > 1) {
            array = h.getRandomArray(arrayLength, maxValue);
        }else{
            array = h.getRandomArray(arrayLength);
        }

        if (printArray) h.print(array);

        long start = System.currentTimeMillis();
        algorithm.sort(array);
        long end = System.currentTimeMillis();

        if (printArray) h.print(array);

        return end - start;
    }

    public void benchLoop(ISortingAlgorithm algorithm, boolean print, int start, int end, int increment){
        System.out.println(algorithm.getClass().getSimpleName());
        for (int i = start; i <= end; i+= increment) {
            System.out.println("Length: " + i);
            setArrayLength(i);
            System.out.println(bench(algorithm, print) +" ms");
        }
    }
}
