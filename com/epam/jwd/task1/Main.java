package com.epam.jwd.task1;
/*

- В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

- Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
включив второй массив между k-м и (k+1) - м элементами первого.

- Вычислить значение выражения по формуле (все переменные принимают действительные значения)

 */

public class Main {
    public static void main(String[] args) {
        MathCalcController controller = new MathCalcController();

        controller.sum(); // operation 1

        int[] numbers1 = {2, 3, 6, 7, 8, 0};
        int[] numbers2 = {22, 6, 34, 9, 4, 1};
        controller.union(numbers1, numbers2, 3); // operation 2
        controller.function(3.4, 2.0, 4.1); // operation 3
    }
}
