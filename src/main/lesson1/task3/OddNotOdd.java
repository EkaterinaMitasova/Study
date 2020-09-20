package main.lesson1.task3;

//Задание: Реализовать метод, который возвращает логическую переменную.
//        Метод должен возвращать true, если N – нечетное число и false, если число N – четное

public class OddNotOdd {

    public static void main(String[] args) {
        OddNotOdd instance = new OddNotOdd();
        int A = 14;
        int A1 = 19;

        System.out.println(instance.notOdd(A));
        System.out.println(instance.notOdd(A1));

    }

    boolean notOdd(int A) {
        return A % 2 != 0;
    }

    boolean notOdd1(int A1) {
        return A1 % 2 != 0;
    }
}