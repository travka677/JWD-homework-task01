package com.epam.jwd.task1;

public class MathCalcController {
    private MathCalcLogic logic = new MathCalcLogic();
    private MathCalcView view = new MathCalcView();

    public void sum(int arrayLength, int upper, int k) {
        int num = logic.sum(logic.getRandomIntegers(arrayLength, upper), k);
        view.printInt(num, "sum = ");
    }

    public void union(int[] array1, int[] array2, int k) {
        int[] array = logic.union(array1, array2, k);
        view.printArray(array, "union - ");
    }

    public void function(double a, double b, double c) {
        double res = logic.function(a, b, c);
        view.printResult(res, "result = ");
    }
}
