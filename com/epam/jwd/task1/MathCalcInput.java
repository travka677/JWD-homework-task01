package com.epam.jwd.task1;

import java.util.Scanner;

public class MathCalcInput {

    public int inputInteger(String message) {
        @SuppressWarnings("resourses")
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print(message);
            while (!input.hasNextInt()) {
                System.out.println("It must be integer");
                System.out.print(message);
                input.next();
            }
            num = input.nextInt();
            if (num <= 0) {
                System.out.println("It must be above zero");
            }
        } while (num <= 0);

        return num;
    }

    public int[] inputArrayOfIntegers(int amount, String message) {
        System.out.println(message);
        if (amount <= 0) {
            throw new RuntimeException("Amount is below 0");
        }
        int[] numbers = new int[amount];

        for (int i = 0; i < amount; i++) {
            int num = inputInteger("");
            numbers[i] = num;
        }

        return numbers;
    }

}
