package com.example.james.movieandroidhomework;

/**
 * Created by james on 05/07/2017.
 */

public class MutableInteger {

    private int value;

    public MutableInteger(int value){
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }

    public void plus(int amount){
        this.value += amount;
    }

    public void minus(int amount){
        this.value -= amount;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
