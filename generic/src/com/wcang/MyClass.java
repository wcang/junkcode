package com.wcang;

public class MyClass implements Comparable<MyClass> {
    private int num;

    public MyClass(int num)
    {
        this.num = num;
    }

    @Override
    public int compareTo(MyClass o) {
        System.out.println("MyClass comparable");

        if (o.num > num)
            return 1;
        else if (o.num < num)
            return -1;
        return 0;
    }
}
