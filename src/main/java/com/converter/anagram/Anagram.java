package com.converter.anagram;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            Formatter formatter = new Formatter();
            System.out.println("You'll get: " + formatter.format(text));
        }
    }

}