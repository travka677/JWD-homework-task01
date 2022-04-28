package com.epam.jwd.task1;

public class MathCalcController {
    private MathCalcInput input = new MathCalcInput();
    private MathCalcLogic logic = new MathCalcLogic();
    private MathCalcView view = new MathCalcView();

    public void sum() {
        System.out.println("Sum of elements that are multiples of a given K");
        int arrayLength = input.inputInteger("Enter a length of array: ");
        int[] numbers = input.inputArrayOfIntegers(arrayLength, "Enter array of integers: ");
        int k = input.inputInteger("Enter k: ");

        int num = logic.sum(numbers, k);
        view.printInt(num, "sum = ");
    }

    public void union(int[] array1, int[] array2, int k) {
        System.out.println("Union of two arrays between k and k + 1 elements of the second array");
        int[] array = logic.union(array1, array2, k);
        view.printArray("union = ", array);
    }

    public void function(double a, double b, double c) {
        System.out.println("Function value");
        double result = logic.function(a, b, c);
        view.printResult("result = ", result);
    }
}
