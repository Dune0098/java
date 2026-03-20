package oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {
    static final int DEFAULT_CAPACITY = 4;
    private int[] v;

    public EnhancedResizableArray() {
        this.v = new int[DEFAULT_CAPACITY];
    }

    public int get(int index){
        if(index >= v.length){
            throw new ArrayStoreException("Array index out of bound");
        }
        return v[index];
    }

    public void set(int index, int value){
        if(v.length <= index){
            v = Arrays.copyOf(v, index * 2);
        }
        v[index] = value;
    }

    public boolean contains(int value){
        for(int a : v){
            if(a == value){
                return true;
            }
        }
        return false;
    }

    public void fill(int value){
        Arrays.fill(v, value);
    }

    public int length(){
        return v.length;
    }

    public int[] toArray(){
        return Arrays.copyOf(v, v.length);
    }
}
