package main.lesson2.task1;

//	Объявить массив типа String, состоящий из следующих элементов: “Пятница”, ”это”, ”лучший”, ”день”, ”недели”.
//            Создать 3 метода, каждый из которых в качестве параметра принимает массив строк.
//            Первый метод должен выводить элементы данного массива на экран с помощью цикла for.
//            Второй метод должен выводить с помощью цикла Foreach.
//            Третий метод должен выводить с помощью цикла While.
//            Элементы должны быть выведены в одну строку с пробелами между словами.
//            После последнего элемента должна быть точка (без пробела после последнего слова)
public class ArrayCyclesVoids {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "Пятница";
        array[1] = "это";
        array[2] = "лучший";
        array[3] = "день";
        array[4] = "недели";
        new ArrayCyclesVoids().withCycleFor(array);
        new ArrayCyclesVoids().withCycleForEach(array);
        new ArrayCyclesVoids().withCycleWhile(array);
    }

    void withCycleFor(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            String s = array[i] + ' ';
            System.out.print(s);
        }
        System.out.println(array[array.length - 1] + ".");
    }

    void withCycleForEach(String[] array) {
        int i = 0;
        for (String element : array) {

            if (i == array.length - 1) {
                System.out.println(element + '.');
            } else {
                System.out.print(element + ' ');
            }
            i++;
        }

    }

    void withCycleWhile(String[] array) {
        int i = 0;
        while (i < array.length - 1) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println(array[array.length - 1] + ".");
    }
}








