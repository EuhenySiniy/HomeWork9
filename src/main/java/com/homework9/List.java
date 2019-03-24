package com.homework9;

public interface List<E> {
    void add(E e);

    void remove(int index);

    void clear();

    int size();

    E get(int index);
}
