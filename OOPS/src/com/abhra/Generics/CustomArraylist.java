package com.abhra.Generics;

import java.util.Arrays;

public class CustomArraylist <T>{
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    public int size = 0;

    public CustomArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }
}
