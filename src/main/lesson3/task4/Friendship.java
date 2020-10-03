package main.lesson3.task4;

public class Friendship {

    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mikhail = new Human("Михаил");
        Human stanislav = new Human("Станислав");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human alexander = new Human("Александр");

        sergey.newFriend(valeriy);
        sergey.newFriend(grigoriy);
        stanislav.newFriend(valeriy);
        stanislav.newFriend(mikhail);
        egor.newFriend(alexander);
        egor.newFriend(grigoriy);
        alexander.newFriend(grigoriy);
        alexander.newFriend(mikhail);

        System.out.println("Сергей, Григорий " + areFriends(sergey, grigoriy));
        System.out.println("Сергей, Александр " + areFriends(sergey, alexander));
        System.out.println("Станислав, Михаил " + areFriends(stanislav, mikhail));
        System.out.println("Михаил, Валерий " + areFriends(mikhail, valeriy));
    }

    static boolean areFriends(Human first, Human second) {
        for (Human firstFriend : first.friends)
            if (firstFriend == second) return true;
        return false;
    }

}
