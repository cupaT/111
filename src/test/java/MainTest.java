package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    //1
    @Test
    void sequence() {
        int n = 4;
        List<String> sequence = Main.sequence(n);
        List<String> expected = new  ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        assertEquals(expected, sequence);

        n = 5;
        expected.add("fizz");
        assertEquals(expected, Main.sequence(n));
    }

    @Test
    void sequenceNegativeSize() {
        int n = -2;
        List<String> sequence = Main.sequence(n);

        assertNull(sequence);
    }

    //2
    @Test
    void reverseString() {
        String str = "make install";
        String expected = "llatsni ekam";
        assertEquals(expected, Main.reverseString(str));

        str = "a";
        expected = "a";
        assertEquals(expected, Main.reverseString(str));
    }

    @Test
    void reverseStringEmpty() {
        String str = "";
        assertNull(Main.reverseString(str));
    }

    //3
    @Test
    void quadraticRoots() {
        assertEquals("2.0, 1.0", Main.quadraticRoots(1, -3, 2));
        assertEquals("нет вещественных корней", Main.quadraticRoots(1, 2, 5));
    }

    @Test
    void quadraticRootsOneRoot() {
        assertEquals("1.0", Main.quadraticRoots(1, -2, 1));
    }

    //4
    @Test
    void calculateSeries() {
        double result = Main.calculateSeries(1e-6);
        assertTrue(result > 0);
    }

    @Test
    void calculateSeriesHighPrecision() {
        double result = Main.calculateSeries(1e-3);
        assertTrue(result > 0);
    }

    //5
    @Test
    void isPalindrome() {
        assertTrue(Main.isPalindrome("level"));
        assertFalse(Main.isPalindrome("test"));
    }

    @Test
    void isPalindromeEmpty() {
        assertFalse(Main.isPalindrome(""));
    }
}