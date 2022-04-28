package com.epam.jwd.task1;

public class MathCalcLogicValidator {

    public static boolean validateInt(int n) {
        return n > 0;
    }

    // the minimum value of k is 0
    // the maximum value of k is the penultimate element of array1
    public static boolean validateInt(int k, int length1) {
        return (k >= 0) && (k < length1 - 1);
    }
}
