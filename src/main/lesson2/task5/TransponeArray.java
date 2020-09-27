package main.lesson2.task5;

import java.util.Random;

public class TransponeArray {

    public static void main(String[] args) {

//        задаем матрицу:
        int m = new Random().nextInt(3) + 3;
        int n = new Random().nextInt(3) + 3;
        int[][] originalMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                originalMatrix[i][j] = new Random().nextInt(9);
            }
        }
// переворачиваем:
        int[][] transponedMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transponedMatrix[i][j] = originalMatrix[j][i];
            }
        }
        System.out.println("Исходный массив");
        for (int[] row : originalMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Транспонированный массив");
        for (int[] row : transponedMatrix) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }
    }
}
