package main.lesson1.task2;

//Задание: Реализовать метод, который возвращает логическую переменную, которая принимает значение true,
//        если площадь прямоугольника больше, чем его периметр.
//        В противном случае метод должен возвращать false.

public class SquarePerimeter {
    public static void main(String[] args) {

        int height = 2;
        int height1 = 6;
        int height2 = 6;
        int width = 5;
        int width1 = 5;
        int width2 = 3;
        int square = height * width;
        int square1 = height1 * width1;
        int square2 = height2 * width2;
        int perimeter = (height + width) * 2;
        int perimeter1 = (height1 + width1) * 2;
        int perimeter2 = (height2 + width2) * 2;

        SquarePerimeter instance = new SquarePerimeter();

        System.out.println(instance.squareIsGreaterThanPerimeter(square, perimeter));
        System.out.println(instance.squareIsGreaterThanPerimeter(square1, perimeter1));
        System.out.println(instance.squareIsGreaterThanPerimeter(square2, perimeter2));
    }

    boolean squareIsGreaterThanPerimeter(int square, int perimeter) {
        return (square > perimeter);
    }
}
