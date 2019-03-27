package com.homework9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    private static final String FIRST_ELEMENT = "zero";
    private static final String SECOND_ELEMENT = "first";

    private MyArrayList<String> myArrayList;

    @Before
    public void setUpCollection() throws Exception {
        myArrayList = new MyArrayList<>();
        myArrayList.add(FIRST_ELEMENT);
        myArrayList.add(SECOND_ELEMENT);
    }

    @Test
    public void addNewElement() {
        myArrayList.add("second");
        String expected = "second";
        assertEquals(expected, myArrayList.get(2));
    }

    @Test
    public void removeElementByIndex() {
        myArrayList.remove(1);
        int expectedSize = 1;
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void clearCollection() {
        myArrayList.clear();
        int expectedSize = 0;
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void returnSizeOfCollection() {
        int expectedSize = 2;
        assertEquals(expectedSize, myArrayList.size());
    }

    @Test
    public void returnElementByIndex() {
        String expectedElement = "zero";
        assertEquals(expectedElement, myArrayList.get(0));
    }
}
