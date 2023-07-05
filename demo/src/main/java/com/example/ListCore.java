package com.example;

import java.util.stream.Stream;

public interface ListCore<T> extends Iterable<T>{
    void add(T element);
    void deleteByIndex(int index);
    void changeByIndex(int index, T element);
    T getElementByIndex(int index);
    void addElemByIndex(int index, T element);
    Stream<T> stream();
}
