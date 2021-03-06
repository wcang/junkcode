package com.wcang.kotlindemo;

public class JavaPerson {
    private String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old";
    }
}
