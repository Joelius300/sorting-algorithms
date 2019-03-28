import Algorithms.Bench;
import Algorithms.Helper;
import Algorithms.InsertionSort;
import Algorithms.SelectionSort;


public class Main {
    private static final Helper h = new Helper();
    private static final int benchLength = 100000;
    private static final Bench bench = new Bench(benchLength);

    public static void main(String[] args){
//        InsertionSort insertionSort = new InsertionSort();
//        System.out.println("Insertion");
//        System.out.println(bench.bench(insertionSort, false));

        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Selection");
        //System.out.println(bench.bench(selectionSort, false));
        for (int i = 1024; i <= Math.pow(2, 20); i*=2) {
            System.out.println("Length: " + i);
            bench.setArrayLength(i);
            System.out.println(bench.bench(selectionSort, false));
        }

        System.out.println("Java");
        System.out.println(bench.benchJavaSort(benchLength, false));
    }
}
