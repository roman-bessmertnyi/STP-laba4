package Sorters;

public class Selection_Sort<T extends Comparable<T>> implements Sorter<T> {
    private Swapper<T> swapper = new Swapper<>();
    public T[] Sort(T[] arr){
        T[] tempArr = arr;
        for(int i=0;i<tempArr.length-1;i++){
            int min=i;
            for(int j=i+1;j<tempArr.length;j++){
                if(tempArr[j].compareTo(tempArr[min])<0){
                    min=j;
                }
            }
            tempArr = swapper.swap(tempArr,i,min);
        }
        return tempArr;
    }
}
