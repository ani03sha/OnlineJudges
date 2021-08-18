package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz testObject = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        List<String> expected = Arrays.asList("1", "2", "Fizz");
        assertEquals(expected, testObject.fizzBuzz(3));

        expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, testObject.fizzBuzz(5));

        expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, testObject.fizzBuzz(15));
    }
}