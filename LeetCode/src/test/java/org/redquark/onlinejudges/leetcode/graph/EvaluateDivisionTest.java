package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvaluateDivisionTest {

    private final EvaluateDivision testObject = new EvaluateDivision();

    @Test
    public void testCalcEquation() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));
        double[] expected = new double[]{6.00000, 0.50000, -1.00000, 1.00000, -1.00000};
        assertArrayEquals(expected, testObject.calcEquation(equations, values, queries));

        equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        equations.add(Arrays.asList("bc", "cd"));
        values = new double[]{1.5, 2.5, 5.0};
        queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("c", "b"));
        queries.add(Arrays.asList("bc", "cd"));
        queries.add(Arrays.asList("cd", "bc"));
        expected = new double[]{3.75000, 0.40000, 5.00000, 0.20000};
        assertArrayEquals(expected, testObject.calcEquation(equations, values, queries));

        equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        values = new double[]{0.5};
        queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "b"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("x", "y"));
        expected = new double[]{0.50000, 2.00000, -1.00000, -1.00000};
        assertArrayEquals(expected, testObject.calcEquation(equations, values, queries));
    }
}