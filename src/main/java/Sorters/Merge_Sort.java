package Sorters;

import java.util.ArrayList;

public class Merge_Sort<T extends Comparable<T>> implements Sorter<T> {
    public T[] Sort(T[] arr){
        T[] tempArr = arr;
        doMergeSort(tempArr,0,tempArr.length);
        return tempArr;
    }
    private void merge(T[] arr,int left,int mid,int right){
        int iter1=0,iter2=0;
        ArrayList<T> result = new ArrayList<>();
        while(left+iter1<mid && mid+iter2<right){
            if(arr[left+iter1].compareTo(arr[mid+iter2])<0){
                result.add(arr[left+iter1]);
                iter1++;
            }else{
                result.add(arr[mid+iter2]);
                iter2++;
            }
        }
        while(left+iter1<mid){
            result.add(arr[left+iter1]);
            iter1++;
        }
        while (mid+iter2<right){
            result.add(arr[mid+iter2]);
            iter2++;
        }
        for(int i=0;i<iter1+iter2;i++){
            arr[left+i]=result.get(i);
        }
    }
    private void doMergeSort(T[] arr,int left,int right){
        if(left+1>=right)
            return;
        int mid = (right+left)/2;
        doMergeSort(arr,left,mid);
        doMergeSort(arr,mid,right);
        merge(arr,left,mid,right);

    }
}
