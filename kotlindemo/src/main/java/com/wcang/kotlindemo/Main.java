package com.wcang.kotlindemo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ang", 38, false);

        System.out.println(person);
        person.setAge(39);
        person.setMarried(true);
        System.out.println("Now " + person);
    }
}
