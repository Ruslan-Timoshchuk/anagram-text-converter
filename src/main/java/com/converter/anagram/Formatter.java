package com.converter.anagram;

public class Formatter {

    public static final String TEXT_DELIMITER = " ";
    
    public String format(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(TEXT_DELIMITER);
        for (String word : words) {
            if (result.length() > 0) {
                result.append(TEXT_DELIMITER);
            }
            result.append(reflect(word));
        }
        return result.toString();
    }
    
    private String reflect(String word) {
        char[] chars = word.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;
        while (leftIndex < rightIndex) {
            if (!Character.isLetter(chars[rightIndex])) {
                rightIndex--;
            } else if (!Character.isLetter(chars[leftIndex])) {
                leftIndex++;
            } else {
                char symbol = chars[leftIndex];
                chars[leftIndex] = chars[rightIndex];
                chars[rightIndex] = symbol;
                leftIndex++;
                rightIndex--;
            }
        }
        return String.valueOf(chars);
    }

}