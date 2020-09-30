package main.lesson3.task2;

public class CatsArrayClass {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat(2, 5, "Барсик");
        cats[1] = new Cat(3, 11, "Мурзик");
        cats[2] = new Cat(7, 2, "Матильда");
        cats[3] = new Cat(1, 3, "Леопольд");
        cats[4] = new Cat(11, 4, "Базилио");

        String[] names = {cats[0].name, cats[1].name, cats[2].name, cats[3].name, cats[4].name};
        CatsArrayClass.sort(names);

        for (String Name : names) {
            for (Cat cat : cats) {
                if (cat.name.equals(Name))
                    System.out.println("Имя: " + cat.name + ", Возраст: " + cat.age + ", Вес:" + cat.weight);
            }
        }
    }

    private static void sort(String[] names) {
    }
}

class Cat {
    int age;
    int weight;
    String name;

    Cat(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

}


