package Main;

import Algorithms.*;
import Bench.Bench;


public class Main {
    private static final Bench bench = new Bench();

    //add to bench class and create method e.g. loopbench to replace the static methods here
    //also add a singleBench method with just sortingAlgorithm, length, [maxValue] and [print?
    private static final int ITERATION_START = 10000;
    private static final int ITERATION_END = 50000;
    private static final int ITERATION_INCREMENT = 10000;
    private static final boolean PRINT_ARRAY = false;


    public static void main(String[] args){
        ISortingAlgorithm[] algorithms = {new BubbleSort(), new InsertionSort(), new JavaAPISort(), new SelectionSort(), new MergeSort()};

        for (int i = 0; i < algorithms.length; i++) {
            //bench.benchLoop(algorithms[i], PRINT_ARRAY, ITERATION_START, ITERATION_END, ITERATION_INCREMENT);
            System.out.println(algorithms[i].getClass().getSimpleName());
            bench.bench(algorithms[i], true);
            System.out.println("Reverse");
            bench.benchReverse(algorithms[i], true);
            System.out.println();
        }

//        ISortingAlgorithm algorithm = new MergeSort();
//        bench.setArrayLength(100);
//        bench.setMaxValue(500);
//        bench.bench(algorithm, true);
    }
}
