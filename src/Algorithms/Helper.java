package Algorithms;

import java.util.Random;

public final class Helper {
    private final Random rnd = new Random();

    public int[] getRandomArray(int length, int maxBound){
        if(maxBound < 1) return null;

        int[] out = new int[length];
        for (int i = 0; i < out.length; i++) {
            int insert;
            do{
                insert = rnd.nextInt(maxBound);
            }while(insert < 0);

            out[i] = insert;
        }

        return out;
    }

    public int[] getRandomArray(int length){
        int[] out = new int[length];
        for (int i = 0; i < out.length; i++) {
            int insert;
            do{
                insert = rnd.nextInt(Integer.MAX_VALUE);
            }while(insert < 0);

            out[i] = insert;
        }

        return out;
    }

    public void swap(int[] array, int i1, int i2){
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

    public void print(int[] array){
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < array.length - 1; i++) {
            out.append(array[i]);
            out.append(", ");
        }

        out.append(array[array.length - 1]);

        System.out.println(out.toString());
    }
}
