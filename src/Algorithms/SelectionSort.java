package Algorithms;

public final class SelectionSort implements SortingAlgorithm{
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
}
