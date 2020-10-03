package main.lesson3.task3;


public class Family {

    public static void main(String[] args) {

        // Родители Сергея
        Human valeriy = new Human("Валерий", 75, null, null);
        Human alexandra = new Human("Александра", 70, null, null);
        // Отец Марины
        Human ivan = new Human("Иван", 62, null, null);
        // Супруги
        Human sergey = new Human("Сергей", 40, valeriy, alexandra);
        Human marina = new Human("Марина", 35, ivan, null);
        // Дети
        Human vitaliy = new Human("Виталий", 4, sergey, marina);
        Human elena = new Human("Елена", 7, sergey, marina);


        for (Human grandParents : elena.grandparents) {
            if (grandParents != null) {
                System.out.println("Имя: " + grandParents.name + ", возраст: " + grandParents.age);
            }
        }
    }
}



