package main.lesson2.task6;

//Дано: Имеется двумерный массив целых чисел, заполненный случайно значениями 1 и 0.
//        Один из элементов (выбирается случайно, но не должен быть на краях матрицы), заполняется значением 2.
//        Изначальная размерность массива MxN неизвестна (но не менее 3).
//        Задание: Создать новый массив. Все элементы, до значения 2, должны быть аналогичными исходному массиву.
//        Все элементы после значения 2, должны быть инвертированы.
//        0 1 0 0 1
//        1 0 0 2 0
//        1 0 1 1 1

import java.util.Random;

public class PartiallyInvertedArray {

    public static void main(String[] args) {
        final int a = new Random().nextInt(9) + 3;
        final int b = new Random().nextInt(9) + 3;

        int[][] originalArray = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                originalArray[i][j] = new Random().nextInt(2);
            }
        }
        // Индекс для элемента 2 не по краям
        final int x = 1 + new Random().nextInt(a - 2);
        final int y = 1 + new Random().nextInt(b - 2);
        originalArray[x][y] = 2;

        int inverse = 0;

        int[][] partiallyInvertedArray = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (originalArray[i][j] == 2) {
                    partiallyInvertedArray[i][j] = 2;
                    inverse = 1;
                    continue;
                }
                partiallyInvertedArray[i][j] = (originalArray[i][j] + inverse) % 2;
            }
        }

        System.out.println("Создаем двумерный массив");
        for (int[] row : originalArray) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Инвертируем значения после \"2\"");
        for (int[] row : partiallyInvertedArray) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }
    }

}
