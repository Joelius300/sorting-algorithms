package Algorithms;

public final class MergeSort implements ISortingAlgorithm {
    public void sort(int[] toSort){
        if(toSort.length < 2) return;

        int[] first = new int[toSort.length/2];
        int[] second = new int[toSort.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = toSort[i];
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = toSort[first.length + i];
        }

        sort(first);
        sort(second);

        mergeSorted(toSort, first, second);
    }

    private void mergeSorted(int[] array, int[] firstPart, int[] secondPart)
    {
        int iFirst = 0;
        int iSecond = 0;

        while(true){
            if(iFirst == firstPart.length)
            {
                for (iSecond = iSecond; iSecond < secondPart.length; iSecond++) {
                    array[iFirst + iSecond] = secondPart[iSecond];
                }

                break;
            }

            if(iSecond == secondPart.length){
                for (iFirst = iFirst; iFirst < firstPart.length; iFirst++) {
                    array[iFirst + iSecond] = firstPart[iFirst];
                }

                break;
            }

            if(firstPart[iFirst] < secondPart[iSecond]){
                array[iFirst+iSecond] = firstPart[iFirst];
                iFirst++;
            }else{
                array[iSecond+iFirst] = secondPart[iSecond];
                iSecond++;
            }
        }

        while(true){
            if(iFirst == firstPart.length)
            {
                for (iSecond = iSecond; iSecond < secondPart.length; iSecond++) {
                    array[iFirst + iSecond] = secondPart[iSecond];
                }

                break;
            }

            if(iSecond == secondPart.length){
                for (iFirst = iFirst; iFirst < firstPart.length; iFirst++) {
                    array[iFirst + iSecond] = firstPart[iFirst];
                }

                break;
            }

            if(firstPart[iFirst] < secondPart[iSecond]){
                array[iFirst+iSecond] = firstPart[iFirst];
                iFirst++;
            }else{
                array[iSecond+iFirst] = secondPart[iSecond];
                iSecond++;
            }
        }
    }
}
