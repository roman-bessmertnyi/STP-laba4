package Sorters;

public class Shell_Sort<T extends Comparable<T>> implements Sorter<T> {
    public T[] Sort(T[] arr){
        T[] tempArr = arr;
        int j;
        for( int gap = tempArr.length / 2; gap > 0; gap /= 2 ){
            for(int i=gap;i<tempArr.length;i++){
                T temp = tempArr[i];
                for (j = i; j >= gap && tempArr[j - gap].compareTo(temp)>0; j -= gap)
                {
                    tempArr[j] = tempArr[j - gap];
                }
                tempArr[j] = temp;
            }
        }
        return tempArr;
    }
}
