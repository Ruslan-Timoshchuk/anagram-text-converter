package com.converter.anagram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FormatterTest {

    private final Formatter formatter = new Formatter();

    @Test
    void givenNull_whenFormat_thenException() {
        assertThrows(NullPointerException.class, () -> formatter.format(null));
    }

    @Test
    void givenEmptyString_whenFormat_thenEmptyString() {
        assertEquals("", formatter.format(""));
    }

    @Test
    void givenWord_whenFormat_thenReflectedWord() {
        assertEquals("dlrow", formatter.format("world"));
    }

    @Test
    void givenSomeNonLetterWord_whenFormat_thenReflectedLetterWord() {
        assertEquals("hgf!e", formatter.format("efg!h"));
    }

    @Test
    void givenNonLetterWord_whenFormat_thenTheSameWord() {
        assertEquals("!1230!", formatter.format("!1230!"));
    }

    @Test
    void givenText_whenFormat_thenReflectedText() {
        assertEquals("dcba hgfe mlkji", formatter.format("abcd efgh ijklm"));
    }

    @Test
    void givenSomeNonLetterText_whenFormat_thenReflectedLetterText() {
        assertEquals("olleh margan!a hgf!e", formatter.format("hello anagra!m efg!h"));
    }

    @Test
    void givenNonLetterText_whenFormat_thenTheSameText() {
        assertEquals("5454 1!234! 7887 3?4!5", formatter.format("5454 1!234! 7887 3?4!5"));
    }

}
