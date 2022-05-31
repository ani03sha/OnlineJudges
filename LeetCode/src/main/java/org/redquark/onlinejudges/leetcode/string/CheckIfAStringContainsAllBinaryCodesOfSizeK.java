package org.redquark.onlinejudges.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class CheckIfAStringContainsAllBinaryCodesOfSizeK {

    public boolean hasAllCodes(String s, int k) {
        Set<String> distinctSubstrings = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            distinctSubstrings.add(s.substring(i, i + k));
        }
        return distinctSubstrings.size() >= Math.pow(2, k);
    }
}
