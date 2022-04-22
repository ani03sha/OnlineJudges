package org.redquark.onlinejudges.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class TextJustification {

    private static final String SPACE = " ";

    public List<String> fullJustify(String[] words, int maxWidth) {
        // List to store the justified text
        List<String> justifiedText = new ArrayList<>();
        // Special case
        if (words == null || words.length == 0) {
            return justifiedText;
        }
        // Length of the array
        int n = words.length;
        // Pointer to traverse through the array
        int i = 0;
        // Loop for all the words in the array
        while (i < n) {
            // Pointer to keep track of the number of words
            // that can be included in one line
            int j = i + 1;
            // Variable that will keep track of total number of characters
            // included words occupy in a line
            int totalCharacters = words[i].length();
            // We will keep including words if the total length
            // of included words plus the necessary spaces is
            // less than the maxWidth. The value of j-i-1 represents
            // the number of necessary spaces between words
            while (j < n && (totalCharacters + words[j].length() + (j - i - 1)) < maxWidth) {
                totalCharacters += words[j].length();
                j++;
            }
            // Total number of words that can be included greedily
            int numberOfWords = j - i;
            // Difference between maxWidth and number of allowed words
            // which will essentially denote the number of spaces
            int spaces = maxWidth - totalCharacters;
            // If there is only one word that is possible in a line,
            // or it's the last word, we will justify left, else we
            // will justify middle.
            if (numberOfWords == 1 || j >= n) {
                justifiedText.add(leftJustify(words, spaces, i, j));
            } else {
                justifiedText.add(middleJustify(words, spaces, i, j));
            }
            // Update i for the next iteration
            i = j;
        }
        return justifiedText;
    }

    private String leftJustify(String[] words, int spaces, int i, int j) {
        // For left justify, we only need spaces on the right
        int spacesOnRight = spaces - (j - i - 1);
        // StringBuilder to represent the line
        StringBuilder line = new StringBuilder(words[i]);
        // Add remaining words with spaces
        for (int k = i + 1; k < j; k++) {
            line.append(SPACE).append(words[k]);
        }
        // Add remaining spaces to the right
        line.append(SPACE.repeat(spacesOnRight));
        return line.toString();
    }

    private String middleJustify(String[] words, int spaces, int i, int j) {
        // Necessary spaces between two words
        int necessarySpaces = j - i - 1;
        // evenly distributed spaces
        int evenlyDistributedSpaces = spaces / necessarySpaces;
        // Extra spaces which need to be put in as much left as possible
        int extraSpaces = spaces % necessarySpaces;
        // StringBuilder to represent the line
        StringBuilder line = new StringBuilder(words[i]);
        // Loop over all the allowed words in the line
        for (int k = i + 1; k < j; k++) {
            // Now the spaces to apply after each word. If the value of
            // extraSpaces is greater than one then we will apply an extra
            // space there
            int spacesToApply = evenlyDistributedSpaces + (extraSpaces > 0 ? 1 : 0);
            // Add spaces and words in the line
            line.append(SPACE.repeat(spacesToApply)).append(words[k]);
            extraSpaces--;
        }
        return line.toString();
    }
}
