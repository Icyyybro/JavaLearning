package Generics;

public class MyArraylist<T> {
    private int capacity;
    private T[] array;

    public MyArraylist() {
    }

    public MyArraylist(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }


    public void set(T t, int index) {
        this.array[index] = t;
    }

    public T getitem(int index) {
        return this.array[index];
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
