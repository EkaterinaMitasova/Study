package main.lesson1.task1;

//Задание: Необходимо создать класс с методом, принимающим целочисленное значение radius, который возвращает площадь окружности.
//        Число ПИ принять равным 3.14

public class Square {
    int radius = 0;
    int radius1 = 2;
    int radius2 = 100;

    public static void main(String[] args) {
        Square instance = new Square();
        // System.out.println(instance.getSquare());
        instance.printSquare();
    }


    void printSquare() {
        double square = 3.14 * radius * radius;
        double square1 = 3.14 * radius1 * radius1;
        double square2 = 3.14 * radius2 * radius2;
        System.out.println(square);
        System.out.println(square1);
        System.out.println(square2);

    }
}
