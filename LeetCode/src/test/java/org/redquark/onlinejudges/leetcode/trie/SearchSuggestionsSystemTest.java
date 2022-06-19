package org.redquark.onlinejudges.leetcode.trie;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchSuggestionsSystemTest {

    private final SearchSuggestionsSystem testObject = new SearchSuggestionsSystem();

    @Test
    public void testSuggestedProducts() {
        String[] products = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("mobile", "moneypot", "monitor"));
        expected.add(Arrays.asList("mobile", "moneypot", "monitor"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        expected.add(Arrays.asList("mouse", "mousepad"));
        assertEquals(expected, testObject.suggestedProducts(products, searchWord));

        products = new String[]{"havana"};
        searchWord = "havana";
        expected = new ArrayList<>();
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        expected.add(Collections.singletonList("havana"));
        assertEquals(expected, testObject.suggestedProducts(products, searchWord));

        products = new String[]{"bags", "baggage", "banner", "box", "cloths"};
        searchWord = "bags";
        expected = new ArrayList<>();
        expected.add(Arrays.asList("baggage", "bags", "banner"));
        expected.add(Arrays.asList("baggage", "bags", "banner"));
        expected.add(Arrays.asList("baggage", "bags"));
        expected.add(Collections.singletonList("bags"));
        assertEquals(expected, testObject.suggestedProducts(products, searchWord));
    }
}