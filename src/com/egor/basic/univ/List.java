package com.egor.basic.univ;

public class List<T> {

    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public List(int size) {
        elements = (T[]) new Object[size];
        this.size = 0;
    }
//    -------------------------------------------------------------------------------------------
    public int getSize() {
        return size;
    }
//    -------------------------------------------------------------------------------------------
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = element;
        size++;
    }
//    -------------------------------------------------------------------------------------------
    public T getBy(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return elements[index];
    }
//    -------------------------------------------------------------------------------------------
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
//    -------------------------------------------------------------------------------------------
    public void removeBy(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }
//    -------------------------------------------------------------------------------------------
    public void remove(T element) {
        int index = indexOf(element);
        if (index != -1) {
            removeBy(index);
        }
    }
//    -------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[elements.length * 2];

        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }
}
