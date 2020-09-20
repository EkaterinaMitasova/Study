package main.lesson1.task6;

public class LogicVariables2 {
    public static void main(String[] args) {


        LogicVariables2 instance = new LogicVariables2();
        System.out.print(instance.contraryResult(false, false, false, false));
        System.out.println(" ");
        System.out.print(instance.contraryResult(true, true, true, true));
        System.out.println(" ");
        System.out.print(instance.contraryResult(false, true, false, true));
        System.out.println(" ");
        System.out.print(instance.contraryResult(true, false, true, false));
        System.out.println(" ");
        System.out.print(instance.contraryResult(true, true, false, false));

    }

    boolean contraryResult(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && !(c || d);
    }
}
