package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionLabelsTest {

    private final PartitionLabels testObject = new PartitionLabels();

    @Test
    public void testPartitionLabels() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> expected = Arrays.asList(9, 7, 8);
        assertEquals(expected, testObject.partitionLabels(s));

        s = "eccbbbbdec";
        expected = Collections.singletonList(10);
        assertEquals(expected, testObject.partitionLabels(s));
    }
}