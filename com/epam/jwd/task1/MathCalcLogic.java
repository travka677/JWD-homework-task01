package com.epam.jwd.task1;

import java.util.Random;

public class MathCalcLogic {

    public double function(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new RuntimeException("Incorrect value");
        }
        double res;

        res = b + Math.sqrt(b*b + 4*a*c);
        res /= (2 * a);
        res -= Math.pow(a, 3) * c;
        res += Math.pow(b, -2);

        return res;
    }
    public int[] union(int[] array1, int[] array2, int k) {
        if (k < 0 || k >= array1.length - 1) {
            throw new RuntimeException("Incorrect value");
        }
        if (array2.length == 0) {
            return array1;
        }
        int[] combined = new int[array1.length + array2.length];

        for (int i = 0; i <= k; i++) {
            combined[i] = array1[i];
        }
        int index = k + 1;

        for (int i = 0; i < array2.length; i++) {
            combined[index++] = array2[i];
        }

        for (int i = k + 1; i < array1.length; i++) {
            combined[index++] = array1[i];
        }
        return combined;
    }

    public int sum(int[] numbers, int k) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % k == 0 ) {
                sum += numbers[i];
            }
        }
        return sum;
    }

}
