package main.lesson2.task7;

//    Задание: Создать метод, который возвращает строку, если возраст от 25 до 44 – «молодой возраст»,
//    от 44 до 60 – «средний возраст», от 60 до 75 – «пожилой возраст», от 75 до 90 – «старческий возраст».
//    Если число не попадает в заданные интервалы, вывести «неизвестный возраст».
//    Нижняя граница включается в диапазон, верхняя – нет. Вывести результат выполнения метода на экран

public class Age {

    public static void main(String[] args) {
        Age Age = new Age();
        System.out.println(Age.ageInterval(32));
        System.out.println(Age.ageInterval(52));
        System.out.println(Age.ageInterval(66));
        System.out.println(Age.ageInterval(82));
        System.out.println(Age.ageInterval(25));
        System.out.println(Age.ageInterval(44));
        System.out.println(Age.ageInterval(60));
        System.out.println(Age.ageInterval(75));
        System.out.println(Age.ageInterval(22));
        System.out.println(Age.ageInterval(119));
    }

    int ageInterval(int age) {
        if (age >= 25 && age < 44) {
            System.out.println("Молодой возраст:");
        } else if (age >= 44 && age < 60) {
            System.out.println("Средний возраст:");
        } else if (age >= 60 && age < 75) {
            System.out.println("Пожилой возраст:");
        } else if (age >= 75 && age < 90) {
            System.out.println("Старческий возраст:");
        } else {
            System.out.println("Неизвестный возраст:");
        }
        return age;
    }

}
