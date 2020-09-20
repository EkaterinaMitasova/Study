package main.lesson1.task4;

//Дано: Существует некое целое число n, обозначающее длину в сантиметрах.
//        Задание: Реализовать метод, который возвращает целое число, равное количеству метров.
//        Например, если N = 280, то метод должен вернуть 2

public class Length {
    public static void main(String[] args) {
        int n = 115; // сантиметры
        int Meters = n / 100;
        int n1 = 800;
        int Meters1 = n1 / 100;
        int n2 = 278;
        int Meters2 = n2 / 100;
        System.out.println(Meters);
        System.out.println(Meters1);
        System.out.println(Meters2);
    }
}