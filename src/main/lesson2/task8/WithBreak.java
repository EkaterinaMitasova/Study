package main.lesson2.task8;

public class WithBreak {

    public static void main(String[] args) {
        final int n = -1;
//        final int n = 2;
//        final int n = 4;
//        final int n = 7;
//        final int n = 0;
        switch (n) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("AA");
                break;
            case 3:
                System.out.println("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
        }
    }
}
