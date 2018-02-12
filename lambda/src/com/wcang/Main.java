package com.wcang;

public class Main {

    interface IMath<T extends Integer> {
        T min(T [] arr);
    }

    public static void testPassing(IMath<Integer> imp) {
        Integer[] array = { 5, 3, 1, 1, 0, 0, 2};
        System.out.println("Passing lambda around and the minimum is " + imp.min(array));
    }

    public static void main(String[] args) {
	    Integer[] array = {1, 2, 3, -1};

	    IMath<Integer> simple = (x) -> {
	        Integer min = x[0];

	        for (Integer element: x) {
	            if (min > element) {
	                min = element;
                }
            }

            return min;
        };

	    System.out.println("Minimum is " + simple.min(array));
	    testPassing(simple);
    }
}
