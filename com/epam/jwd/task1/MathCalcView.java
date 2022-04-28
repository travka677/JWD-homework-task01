package com.epam.jwd.task1;

import java.util.Arrays;

public class MathCalcView {
    public void printInt(int sum, String message) {
        System.out.println(message + sum);
    }

    public void printArray(String message, int[] array) {
        System.out.print(message + Arrays.toString(array));
    }

    public void printResult(String message, double result) {
        System.out.printf(message + result);
    }

}
