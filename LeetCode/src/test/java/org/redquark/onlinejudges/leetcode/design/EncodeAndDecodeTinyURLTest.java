package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.design.EncodeAndDecodeTinyURL.Codec;

public class EncodeAndDecodeTinyURLTest {

    @Test
    public void test() {
        Codec testObject = new Codec();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = testObject.encode(longUrl);
        assertEquals(longUrl, testObject.decode(shortUrl));
    }
}