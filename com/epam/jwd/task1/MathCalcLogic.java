package com.epam.jwd.task1;

import java.util.Random;

public class MathCalcLogic {

    public double function(double a, double b, double c) {
        double res;

        res = b + Math.sqrt(b*b + 4*a*c);
        res /= (2 * a);
        res -= Math.pow(a, 3) * c;
        res += Math.pow(b, -2);

        return res;
    }
    public int[] union(int[] array1, int[] array2, int k) {
        if (!MathCalcLogicValidator.validateInt(k, array1.length)) {
            return new int[0];
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

    public int[] getRandomIntegers(int amount, int upperBound) {
        int[] integers = new int[amount];
        Random random = new Random();

        if (MathCalcLogicValidator.validateInt(amount) && MathCalcLogicValidator.validateInt(upperBound)) {
            for (int i = 0; i < amount; i++) {
                int num = random.nextInt(upperBound);
                integers[i] = num;
            }
        }
        return integers;
    }
}
