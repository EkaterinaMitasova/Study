package main.lesson1.task5;

//Задача: Реализовать 2 метода. Оба метода должны принимать в качестве параметров логические переменные a и b.
//        Первый метод должен сначала выполнить логическую операцию ИЛИ между аргументами.
//        Возвращать метод должен значение, противоположное результаты выполнения операции
//        Второй метод должен сначала инвертировать каждый из аргументов.
//        Возвращать метод должен результат логической операции И между двумя инвертированными элементами

public class LogicVariables {
    public static void main(String[] args) {


        LogicVariables instance = new LogicVariables();
        System.out.print(instance.contraryResult(false, false));
        System.out.print(" ");
        System.out.println(instance.contraryResult1(false, false));


        System.out.print(instance.contraryResult(false, true));
        System.out.print(" ");
        System.out.println(instance.contraryResult1(false, true));


        System.out.print(instance.contraryResult(true, false));
        System.out.print(" ");
        System.out.println(instance.contraryResult1(true, false));


        System.out.print(instance.contraryResult(true, true));
        System.out.print(" ");
        System.out.println(instance.contraryResult1(true, true));
    }

    boolean contraryResult(boolean a, boolean b) {
        return !(a || b);
    }


    boolean contraryResult1(boolean a, boolean b) {
        return (!a && !b);
    }
}
