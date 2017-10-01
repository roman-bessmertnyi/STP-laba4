package Sorters;

public class Quick_Sort<T extends Comparable<T>> implements Sorter<T> {
    private Swapper<T> swapper = new Swapper<>();
    public T[] Sort(T[] arr){
        T[] tempArr = arr;
        directQuickSort(tempArr,0,tempArr.length-1);
        return tempArr;
    }
    private void directQuickSort(T[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int separator=partition(arr,low,high);
        directQuickSort(arr,low,separator);
        directQuickSort(arr,separator+1,high);

    }
    private int partition(T[] arr,int low,int high){
        int i=low;
        int j=high;
        int separator=(high+low)/2;
        while(i<j){
            while(i<separator && (arr[i].compareTo(arr[separator])<0 || arr[i].equals(arr[separator]))){
                i++;
            }
            while (j>separator && (arr[j].compareTo(arr[separator])>0 || arr[j].equals(arr[separator]))){
                j--;
            }
            if(i<j) {
                arr = swapper.swap(arr, i, j);
                if (i == separator)
                    separator = j;
                else if (j == separator)
                    separator = i;
            }
        }
        return separator;
    }
}
