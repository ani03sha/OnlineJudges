package org.redquark.onlinejudges.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.heap.FindMedianFromDataStream.MedianFinder;

public class FindMedianFromDataStreamTest {

    private final MedianFinder testObject = new MedianFinder();

    @Test
    public void test() {
        testObject.addNum(1);
        testObject.addNum(2);
        assertEquals(1.5, testObject.findMedian());
        testObject.addNum(3);
        assertEquals(2.0, testObject.findMedian());
    }
}