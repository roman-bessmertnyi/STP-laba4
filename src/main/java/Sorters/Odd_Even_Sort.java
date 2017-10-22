package Sorters;

public class Odd_Even_Sort<T extends Comparable<T>> implements Sorter<T> {
    private Swapper<T> swapper = new Swapper<>();
    public T[] Sort(T[] arr){
        T[] tempArr = arr;
        boolean sorted = false;
        while (!sorted){
            sorted=true;
            for(int i=1;i<=tempArr.length-2;i+=2){
                if(tempArr[i].compareTo(tempArr[i+1])>0){
                    tempArr = swapper.swap(tempArr,i,i+1);
                    sorted=false;
                }
            }
            for(int i=0;i<=tempArr.length-2;i+=2){
                if(tempArr[i].compareTo(tempArr[i+1])>0){
                    tempArr = swapper.swap(tempArr,i,i+1);
                    sorted=false;
                }
            }
        }
        return tempArr;
    }
}
