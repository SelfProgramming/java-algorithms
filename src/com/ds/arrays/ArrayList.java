package com.ds.arrays;

public class ArrayList<E> {
    private final static int DEFAULT_CAPACITY = 1;
    private int size;

    private Object[] arr;

    public int size() {
        return size;
    }

    public ArrayList() {
        this.arr = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialCapacity) {
        this.arr = new Object[initialCapacity];
    }

    public void add(E element) {
        if (arr.length == size) {
            this.grow();
        }

        arr[size] = element;
        size++;
    }

    public E get(int index) {
        if (arr.length - 1 < index) {
            throw new IndexOutOfBoundsException();
        }
        return (E) arr[index];
    }

    public E last() {
        return this.get(size - 1);
    }

    private void grow() {
        int newCapacity = arr.length * 2;
        var newArr = new Object[newCapacity];

        System.arraycopy(arr, 0, newArr, 0, arr.length);

        this.arr = newArr;
    }
}
