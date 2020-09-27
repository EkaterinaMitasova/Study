package main.lesson2.task4;

import java.util.Arrays;

public class ExcludeRepeatingSymbols {

    public static void main(String[] args) {

        String first = "hello";
        String second = "world";

//        String first = "ping";
//        String second = "pong";

//        String first = "qwer";
//        String second = "asdf";

//        String first = "post";
//        String second = "get";

        char[] firstStringChars = first.toCharArray();
        Arrays.sort(firstStringChars);

        StringBuilder result = new StringBuilder();
        for (char ch : firstStringChars) {
            String symbol = String.valueOf(ch);
            if (result.toString().contains(symbol))
                continue;
            if (second.contains(symbol)) result.append(symbol);
        }
        System.out.println(result);
    }
}

