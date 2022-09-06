package com.company;
import java.util.Locale;

public class Main {
    public static void main(String[] args)
    {

        System.out.println(wordsCount(" "));
        System.out.println(wordsCount("Hello world"));
        System.out.println(wordsCount("?"));
        System.out.println(wordsCount("Java programing task"));

        System.out.println("---------------");

        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));
        System.out.println(isPalindrome("Java programing task"));
        System.out.println(isPalindrome("Level"));
    }

    private static int wordsCount(String input) {

        input = input.trim().replaceAll("\\W+", " ");

        if (input.isEmpty() || input.equals(" ")) {
            return 0;
        }

        String[] words = input.split("\\s");
        return words.length;
    }

    private static boolean isPalindrome(String input) {

        input = input.trim().replaceAll("\\W+", " ");

        if (input.isEmpty() || input.equals(" ")) {
            return false;
        }

        String symbols = input.toLowerCase(Locale.ROOT).replaceAll("\\s", "");

        for (int i = 0; i < symbols.length() / 2; i++) {
            if (symbols.charAt(i) != symbols.charAt(symbols.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
