package org.redquark.onlinejudges.leetcode.design;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Anirudh Sharma
 */
public class PeekingIterator implements Iterator<Integer> {

    private final Iterator<Integer> iterator;
    private Integer next;
    private boolean areElementsLeft;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.areElementsLeft = true;
        moveCursor();
    }

    public Integer peek() {
        return this.next;
    }

    @Override
    public Integer next() {
        if (areElementsLeft) {
            int value = this.next;
            moveCursor();
            return value;
        }
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        return areElementsLeft;
    }

    private void moveCursor() {
        if (this.iterator.hasNext()) {
            this.next = iterator.next();
        } else {
            this.areElementsLeft = false;
        }
    }
}
