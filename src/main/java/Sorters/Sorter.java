package Sorters;

public interface  Sorter<T extends Comparable<T>> {
    public T[] Sort(T[] arr);
}
