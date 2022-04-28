package com.epam.jwd.task1;

public class MathCalcView {
    public void printInt(int sum, String message) {
        System.out.println(message + sum);
    }

    public void printArray(int[] array, String message) {
        if (array.length == 0) {
            System.out.println("Something went wrong");
            return;
        }
        System.out.print(message + "{");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf(array[i] + "}");
                break;
            } else {
                System.out.printf(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public void printResult(double result, String message) {
        System.out.printf(message + result);
    }

}
