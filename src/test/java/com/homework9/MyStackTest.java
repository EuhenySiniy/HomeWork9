package com.homework9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStackTest {
    private MyStack<String> myStack = new MyStack<>(10);

    @Test
    public void pushNewElement() {
        int expectedSize = 1;
        String expectedElement = "zero";
        myStack.push("zero");
        assertEquals(expectedElement, myStack.peek());
        assertEquals(expectedSize, myStack.size());
    }

    @Test
    public void removeElementFromStack() {
        int expectedSize = 0;
        myStack.push("zero");
        myStack.remove();
        assertEquals(expectedSize, myStack.size());
    }

    @Test
    public void clearAllElements() {
        int expectedSize = 0;
        myStack.push("zero");
        myStack.push("one");
        myStack.push("two");
        myStack.clear();
        assertEquals(expectedSize, myStack.size());
    }

    @Test
    public void showSizeOfStack() {
        int expectedSize = 3;
        myStack.push("zero");
        myStack.push("one");
        myStack.push("two");
        assertEquals(expectedSize, myStack.size());
    }

    @Test
    public void peekElement() {
        int expectedSize = 2;
        String expectedElement = "one";
        myStack.push("zero");
        myStack.push("one");
        assertEquals(expectedElement, myStack.peek());
        assertEquals(expectedSize, myStack.size());
    }

    @Test
    public void popElement() {
        int expectedSize = 1;
        String expectedElement = "one";
        myStack.push("zero");
        myStack.push("one");
        assertEquals(expectedElement, myStack.pop());
        assertEquals(expectedSize, myStack.size());
    }
}
