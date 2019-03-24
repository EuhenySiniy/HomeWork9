package com.homework9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    private MyArrayList<String> myArrayList = new MyArrayList<>();

    @Test
    public void add() {
        int expectedSize = 3;
        myArrayList.add("zero");
        myArrayList.add("one");
        myArrayList.add("two");
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void remove() {
        int expectedSize = 2;
        myArrayList.add("zero");
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.remove(1);
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void clear() {
        int expectedSize = 0;
        myArrayList.add("zero");
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.clear();
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void size() {
        int expectedSize = 1;
        myArrayList.add("zero");
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void get() {
        String expectedElement = "zero";
        myArrayList.add("zero");
        assertEquals(expectedElement, myArrayList.get(0));
    }
}