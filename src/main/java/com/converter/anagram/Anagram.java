package com.converter.anagram;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Formatter formatter = new Formatter();
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                System.out.println("You'll get: " + formatter.format(text));
            }
        }
    }

}