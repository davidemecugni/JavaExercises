package oop.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EnhancedResizableArray {
    static final int DEFAULT_CAPACITY = 2;
    int[] v;

    public EnhancedResizableArray() {
        this.v = new int[DEFAULT_CAPACITY];
    }

    public int get(int index) {
        if(index < v.length){
            return v[index];
        }
        return -1;
    }

    public void set(int index, int value) {
        if(index >= v.length){
            int[] tmp = new int[index*2];
            System.arraycopy(v,0,tmp,0,v.length);
            v = tmp;
        }
        v[index] = value;
    }

    public boolean contains(int value){
        return IntStream.of(v).anyMatch(x -> x == value);
    }

    public void fill(int value){
        Arrays.fill(v, value);
    }

    public int[] toArray(){
        return Arrays.copyOf(v, v.length);
    }

    public int length(){
        return v.length;
    }
}
