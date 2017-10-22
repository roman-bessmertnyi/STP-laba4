package Sorters;

public class Bubble_Sort<T extends Comparable<T>> implements Sorter<T> {
    private Swapper<T> swapper = new Swapper<>();
    public T[] Sort(T[] arr){
        T[] tempArr = arr;
        for(int i=0;i<tempArr.length;i++){
            for(int j = 0;j<tempArr.length-1-i;j++){
                if(tempArr[j].compareTo(tempArr[j+1])>0){
                    tempArr = swapper.swap(tempArr,j,j+1);
                }
            }
        }
        return tempArr;
    }
}
