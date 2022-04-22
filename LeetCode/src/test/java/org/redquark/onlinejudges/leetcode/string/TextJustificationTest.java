package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextJustificationTest {

    private final TextJustification testObject = new TextJustification();

    @Test
    public void testFullJustify() {
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> expected = Arrays.asList("This    is    an", "example  of text", "justification.  ");
        assertEquals(expected, testObject.fullJustify(words, maxWidth));

        words = new String[]{"What", "must", "be", "acknowledgment", "shall", "be"};
        expected = Arrays.asList("What   must   be", "acknowledgment  ", "shall be        ");
        assertEquals(expected, testObject.fullJustify(words, maxWidth));

        words = new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        maxWidth = 20;
        expected = Arrays.asList("Science  is  what we", "understand      well", "enough to explain to", "a  computer.  Art is", "everything  else  we", "do                  ");
        assertEquals(expected, testObject.fullJustify(words, maxWidth));
    }
}