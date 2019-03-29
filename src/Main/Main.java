package Main;

import Algorithms.BubbleSort;
import Bench.Bench;
import Helper.Helper;
import Algorithms.SelectionSort;


public class Main {
    private static final Helper h = new Helper();
    private static final int benchLength = 100000;
    private static final Bench bench = new Bench(benchLength);

    //add to bench  class and create method e.g. loopbench to replace the static methods here
    //also add a singleBench method with just sortingAlgorithm, length, [maxValue] and [print?
    private static final int ITERATIONSTART = 10000;
    private static final int ITERATIONEND = 100000;
    private static final int ITERATIONINCREMENT = 10000;
    private static final boolean PRINTARRAY = false;

    public static void main(String[] args){
//        InsertionSort insertionSort = new InsertionSort();
//        System.out.println("Insertion");
//        System.out.println(bench.bench(insertionSort, false));

        BenchBubbleSort(bench);
        BenchSelectionSort(bench);
        BenchJavaSort(bench);
    }

    private static void BenchSelectionSort(Bench bench){
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Selection");
        for (int i = ITERATIONSTART; i <= ITERATIONEND; i+=ITERATIONINCREMENT) {
            System.out.println("Length: " + i);
            bench.setArrayLength(i);
            System.out.println(bench.bench(selectionSort, PRINTARRAY) +" ms");
        }
    }

    private static void BenchBubbleSort(Bench bench){
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Bubble");
        for (int i = ITERATIONSTART; i <= ITERATIONEND; i+=ITERATIONINCREMENT) {
            System.out.println("Length: " + i);
            bench.setArrayLength(i);
            System.out.println(bench.bench(bubbleSort, PRINTARRAY) +" ms");
        }
    }

    private static void BenchJavaSort(Bench bench){
        System.out.println("Java");
        for (int i = ITERATIONSTART; i <= ITERATIONEND; i+=ITERATIONINCREMENT) {
            System.out.println("Length: " + i);
            bench.setArrayLength(i);
            System.out.println(bench.benchJavaSort(benchLength, PRINTARRAY) + " ms");
        }
    }
}
