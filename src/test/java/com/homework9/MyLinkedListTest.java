package com.homework9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    private MyLinkedList<String> myLinkedList = new MyLinkedList<>();

    @Test
    public void add() {
        int expectedSize = 1;
        String expectedElement = "zero";
        myLinkedList.add("zero");
        assertEquals(expectedElement, myLinkedList.get(0));
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void remove() {
        int expectedSize = 1;
        myLinkedList.add("zero");
        myLinkedList.add("one");
        myLinkedList.remove(0);
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void clear() {
        int expectedSize = 0;
        myLinkedList.add("zero");
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.clear();
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void size() {
        int expectedSize = 3;
        myLinkedList.add("zero");
        myLinkedList.add("one");
        myLinkedList.add("two");
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void get() {
        String expectedElement = "zero";
        myLinkedList.add("zero");
        assertEquals(expectedElement, myLinkedList.get(0));
    }
}