package com.homework9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    private MyLinkedList<String> myLinkedList = new MyLinkedList<>();

    @Test
    public void addNewElement() {
        int expectedSize = 1;
        String expectedElement = "zero";
        myLinkedList.add("zero");
        assertEquals(expectedElement, myLinkedList.get(0));
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void removeElementFromList() {
        int expectedSize = 1;
        myLinkedList.add("zero");
        myLinkedList.add("one");
        myLinkedList.remove(0);
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void clearAllElements() {
        int expectedSize = 0;
        myLinkedList.add("zero");
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.clear();
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void showSizeList() {
        int expectedSize = 3;
        myLinkedList.add("zero");
        myLinkedList.add("one");
        myLinkedList.add("two");
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void getElement() {
        String expectedElement = "zero";
        myLinkedList.add("zero");
        assertEquals(expectedElement, myLinkedList.get(0));
    }
}
