package lab4;

import java.util.Arrays;
import java.util.Random;
import Sorters.*;

public class Sorter_Timer extends Greeter{
    private final int size=1500;
    private final int intMaxSize=50000;
    private final int intMinSize=25000;
    private final int secondsDivider=1000000;

    public Sorter_Timer() {
        name = "The class that checks sorting times";
    }

    public void Calculate(){

        Integer[] arr = generateArray(size);
        long startClock=0;
        long endClock=0;
        showArray(arr);
        testSorter(arr, new Odd_Even_Sort(), startClock, endClock, "Odd Even Sort :");
        testSorter(arr, new Quick_Sort(), startClock, endClock, "Quick Sort :");


        showArray(arr);
        startClock=System.nanoTime();
        Integer[] testArr = arr.clone();
        Arrays.sort(testArr);
        endClock=System.nanoTime();
        System.out.println("Default JAVA(timsort) Sort :" + String.format("%,12d",(endClock-startClock)/secondsDivider) + " ms");

        testSorter(arr, new Bubble_Sort(), startClock, endClock, "Bubble Sort :");
        testSorter(arr, new Selection_Sort(), startClock, endClock, "Selection Sort :");
        testSorter(arr, new Merge_Sort(), startClock, endClock, "Merge Sort :");
        testSorter(arr, new Shell_Sort(), startClock, endClock, "Shell Sort :");

    }


    private Integer[] generateArray(int n){
        Integer[] array = new Integer[n];
        Random rand = new Random();
        for(int i =0;i<n;i++)
            array[i]=rand.nextInt(intMaxSize)-intMinSize;
        return array;
    }
    private void showArray(Comparable[] arr) {
        for (Comparable var : arr)
            System.out.print(var + " ");
        System.out.println();
    }
    private void testSorter(Integer[] arr, Sorter sorter, long startClock, long endClock, String message) {
        showArray(arr);
        startClock=System.nanoTime();
        Comparable[] tempArr = sorter.Sort(arr.clone());
        endClock=System.nanoTime();
        System.out.println(message + String.format("%,12d",(endClock-startClock)/secondsDivider) + " ms");
    }
}
