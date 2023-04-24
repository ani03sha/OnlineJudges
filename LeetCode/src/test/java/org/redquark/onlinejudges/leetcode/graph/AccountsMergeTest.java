package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsMergeTest {

    private final AccountsMerge accountsMerge = new AccountsMerge();

    @Test
    public void testAccountsMerge() {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(List.of("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(List.of("Mary", "mary@mail.com"));
        accounts.add(List.of("John", "johnnybravo@mail.com"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("John", "johnnybravo@mail.com"));
        expected.add(List.of("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"));
        expected.add(List.of("Mary", "mary@mail.com"));
        assertEquals(expected, accountsMerge.accountsMerge(accounts));

        accounts = new ArrayList<>();
        accounts.add(List.of("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"));
        accounts.add(List.of("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"));
        accounts.add(List.of("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"));
        accounts.add(List.of("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"));
        accounts.add(List.of("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co"));
        expected = new ArrayList<>();
        expected.add(List.of("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"));
        expected.add(List.of("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"));
        expected.add(List.of("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"));
        expected.add(List.of("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"));
        expected.add(List.of("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"));
        assertEquals(expected, accountsMerge.accountsMerge(accounts));
    }
}