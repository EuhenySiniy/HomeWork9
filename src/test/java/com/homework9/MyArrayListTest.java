package com.homework9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    private MyArrayList<String> myArrayList = new MyArrayList<>();

    @Test
    public void addElementsToList() {
        int expectedSize = 1;
        String expectedElement = "zero";
        myArrayList.add("zero");
        assertEquals(expectedSize, myArrayList.size());
        assertEquals(expectedElement, myArrayList.get(0));
    }

    @Test
    public void removeElementsFromList() {
        int expectedSize = 2;
        myArrayList.add("zero");
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.remove(1);
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void clearAllElements() {
        int expectedSize = 0;
        myArrayList.add("zero");
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.clear();
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void showSizeOfList() {
        int expectedSize = 1;
        myArrayList.add("zero");
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void getElement() {
        String expectedElement = "zero";
        myArrayList.add("zero");
        assertEquals(expectedElement, myArrayList.get(0));
    }
}
