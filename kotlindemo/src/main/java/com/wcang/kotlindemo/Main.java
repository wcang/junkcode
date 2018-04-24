package com.wcang.kotlindemo;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ang", 38, false);

        System.out.println(person);
        person.setAge(39);
        person.setMarried(true);
        System.out.println("Now " + person);
        ArrayList<String> test = new ArrayList<>();
        test.add("1");
        test.add("2");
        System.out.println(StringUtil.stupidFunction(test, "!"));
    }
}
