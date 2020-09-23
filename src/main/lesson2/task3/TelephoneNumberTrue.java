package main.lesson2.task3;

public class TelephoneNumberTrue {

    public static void main(String[] args) {

        String number = "+7(901)423-73-12";
        String number1 = "7(910)423-73-12";
        String number2 = "89215310934";
        String number3 = "+5(911)310-12-74";
        String number4 = "+7(9fg)125-42-99";
        String number5 = "++7(122)2342343";
        String number6 = "";
        String number7 = "a";
        String number8 = "+7(901)42a-73-12";

        TelephoneNumberTrue instance = new TelephoneNumberTrue();
        System.out.println("Проверка с помощью цикла.");
        System.out.println(number + " " + instance.TelephoneNumberCorrect(number));
        System.out.println(number1 + " " + instance.TelephoneNumberCorrect(number1));
        System.out.println(number2 + " " + instance.TelephoneNumberCorrect(number2));
        System.out.println(number3 + " " + instance.TelephoneNumberCorrect(number3));
        System.out.println(number4 + " " + instance.TelephoneNumberCorrect(number4));
        System.out.println(number5 + " " + instance.TelephoneNumberCorrect(number5));
        System.out.println(number6 + " " + instance.TelephoneNumberCorrect(number6));
        System.out.println(number7 + " " + instance.TelephoneNumberCorrect(number7));
        System.out.println(number8 + " " + instance.TelephoneNumberCorrect(number8));

        System.out.println("Проверка с помощью регулярного выражения.");
        System.out.println(number + " " + instance.TelephoneNumberCorrectReg(number));
        System.out.println(number1 + " " + instance.TelephoneNumberCorrect(number1));
        System.out.println(number2 + " " + instance.TelephoneNumberCorrect(number2));
        System.out.println(number3 + " " + instance.TelephoneNumberCorrect(number3));
        System.out.println(number4 + " " + instance.TelephoneNumberCorrect(number4));
        System.out.println(number5 + " " + instance.TelephoneNumberCorrect(number5));
        System.out.println(number6 + " " + instance.TelephoneNumberCorrect(number6));
        System.out.println(number7 + " " + instance.TelephoneNumberCorrect(number7));
        System.out.println(number8 + " " + instance.TelephoneNumberCorrect(number8));
    }


    boolean TelephoneNumberCorrect(String number) {
        if (number == null)
            return false;
        if (!number.startsWith("+7("))
            return false;
        if (number.charAt(6) != ')')
            return false;
        if (number.charAt(10) != '-')
            return false;
        if (number.charAt(13) != '-')
            return false;
        if (number.length() != 16)
            return false;
        //Индексы, где цифры:
        int[] numberIndex = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        String numberSymbols = "0123456789";

        for (int index : numberIndex) {
            String symbol = String.valueOf(number.charAt(index));
            if (!numberSymbols.contains(symbol))
                return false;
        }
        return true;
    }


    boolean TelephoneNumberCorrectReg(String number) {
        return number.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }
}


