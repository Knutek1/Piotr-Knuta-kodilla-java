package com.kodilla.testing;

import com.sun.source.util.SourcePositions;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        String word1 = "lampara de techo, Iguana, Yeti";
        // zrobiłem wypisanie na ekran, dla sprawdzenia zwracanego Stringa samogłoskowego
        System.out.println(vowels(word1));
    }

    public static String vowels(String word) {
        char tab[] = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char i : tab) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'y' || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U' || i == 'Y') {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}