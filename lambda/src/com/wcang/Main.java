package com.wcang;

public class Main {

    interface IMath {
        int min(int [] arr);
    }

    public static void testPassing(IMath imp) {
        int[] array = { 5, 3, 1, 1, 0, 0, 2};
        System.out.println("Passing lambda around and the minimum is " + imp.min(array));
    }

    public static void main(String[] args) {
	    int[] array = {1, 2, 3, -1};

	    IMath simple = (x) -> {
	        int min = x[0];

	        for (int element: x) {
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
