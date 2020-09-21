package main.lesson1.task4;

//Дано: Существует некое целое число n, обозначающее длину в сантиметрах.
//        Задание: Реализовать метод, который возвращает целое число, равное количеству метров.
//        Например, если N = 280, то метод должен вернуть 2

public class Length {
    public static void main(String[] args) {
        int n = 115; // сантиметры
        int meters = n / 100;
        int n1 = 800;
        int meters1 = n1 / 100;
        int n2 = 278;
        int meters2 = n2 / 100;
        System.out.println(meters);
        System.out.println(meters1);
        System.out.println(meters2);
    }
}