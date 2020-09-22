package main.lesson1.task1;

//Задание: Необходимо создать класс с методом, принимающим целочисленное значение radius, который возвращает площадь окружности.
//        Число ПИ принять равным 3.14

public class Square {
    public static void main(String[] args) {
        Square Square = new Square();
        System.out.println(Square.printSquare(0));
        System.out.println(Square.printSquare(2));
        System.out.println(Square.printSquare(100));

    }

    double printSquare(int radius) {
        return 3.14 * radius * radius;
    }
}
