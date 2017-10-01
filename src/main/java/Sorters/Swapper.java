package Sorters;

public class Swapper<T extends Comparable<T>> {
    public T[] swap(T[] arr,int i,int j){
        T[] tmpArr = arr;
        T tmp = tmpArr[j];
        tmpArr[j]=tmpArr[i];
        tmpArr[i]=tmp;
        return tmpArr;
    }
}