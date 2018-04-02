package com.wcang;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // if Comparable<T> is used compiler will complain that int cannot be converted to T
    // that's the difference between Comparable<T> and Comparable. Basically
    // Comparable is just a raw type of Comparable<T>
    public static <T extends Comparable> int greaterThan(T[] list, int threshold) {
        int count = 0;

        for (T elem: list) {
            if (elem.compareTo(threshold) > 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("testing 123");
        Integer[] list = {1, 2, 3, 4, 5};
        System.out.println("Greater than 3 count " + greaterThan(list, 3));
        MyClass[] anotherList = {
                new MyClass(1),
                new MyClass(2),
                new MyClass(3),
                new MyClass(4),
                new MyClass(5),
        };
        //System.out.println("Greater than 3 count " + greaterThan(anotherList, new MyClass(3)));
        List<Integer> genericList = new ArrayList<>();
        genericList.add(1);
        List rawList = genericList;

        for (Object obj: rawList) {
            System.out.println(obj);
        }
    }
}
