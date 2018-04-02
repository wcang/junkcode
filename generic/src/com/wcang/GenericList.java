package com.wcang;

import java.util.ArrayList;
import java.util.Collection;

public class GenericList<T> implements GenericInterface<T> {
    ArrayList<T> entries;

    public GenericList() {
        entries = new ArrayList<>();
    }

    @Override
    public void add(T entry) {
        entries.add(entry);
    }

    @Override
    public void print() {
        for (T elem: entries) {
            System.out.println(elem);
        }
    }
}
