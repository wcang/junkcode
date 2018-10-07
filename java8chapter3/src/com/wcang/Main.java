package com.wcang;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T entry: list) {
            if (predicate.test(entry)) {
                result.add(entry);
            }
        }

        return result;
    }

    public static void testStringWithMoreThanOneWord() {
        ArrayList<String> names = new ArrayList<String>() {
            {
                add("Ang Way Chuang");
                add("Chun Mun");
                add("Roberto");
                add("Johnson");
                add("Marcin Blazejewski");
            }
        };

        List<String> moreWords = filter(names, (x) -> x.split("\\s").length > 1 );

        System.out.println("Name with more than one word: " + moreWords);
    }

    public static void main(String[] args) {
        testStringWithMoreThanOneWord();
    }
}
