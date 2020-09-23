package main.lesson2.task2;

//    //    Объявить двумерный массив целых значений размером 8х8.
//   Заполнить данный массив цифрами «0» и «1» в шахматном порядке.
//   Начальный элемент ([0][0]) должен быть равен нулю.
//   После заполнения массива вывести его на экран тремя способами: Через For, через Foreach, через While.
//   Вывод на экран должен быть также в виде шахматной доски.

public class ArrayAndCycles {
    public static void main(String[] args) {
        int[][] array = {{0, 1, 0, 1, 0, 1, 0, 1}, {1, 0, 1, 0, 1, 0, 1, 0}};
//   Через For
        System.out.println("Первый способ. For");
        int k = 0;
        while (k < 4) {
            for (int[] ints : array) {
                for (int anInt : ints) {
                    System.out.print(anInt + "\t");
                }
                System.out.println();
            }
            k++;
        }


        //через Foreach
        System.out.println("Второй способ. Foreach");
        for (int a = 0; a < 8; a++) {
            for (int[] i : array) {
                for (int y : i)
                    System.out.print(y + "\t");
                System.out.println();
            }
            a++;
        }


        System.out.println("Третий способ. While");
        for (int a = 0; a < 8; a++) {
            int j = 0;
            int w = 0;
            while (j < array.length) {
                while (w < array[j].length) {
                    System.out.print(array[j][w] + "\t");
                    w++;
                }
                System.out.println();
                w = 0;
                j++;
            }
            a++;
        }
    }
}
    


















