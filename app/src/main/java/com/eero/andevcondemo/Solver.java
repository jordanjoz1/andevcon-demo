package com.eero.andevcondemo;

public class Solver {
    private static int dictionary[];

    public int calcFib(int n) {
        dictionary = new int[n];
        return fibonacci(n);
    }

    int fibonacci(int n) {
        if (n <= 0) {
            throw new RuntimeException("Bad input");
        }
        if (dictionary[n - 1] == 0) {
            if (n <= 2) {
                dictionary[n - 1] = n - 1;
            } else {
                dictionary[n - 1] = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        return dictionary[n - 1];
    }
}
