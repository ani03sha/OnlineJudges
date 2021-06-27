package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class StoneGame {

    public boolean stoneGame(int[] piles) {
        /*
         * Alex is first to pick from the pile.
         * Since length of the pile is even, which gives us
         *
         * Alex can always pick from odd piles or always pick
         * from even piles
         *
         * For example,
         * If Alex wants to pick even indexed piles piles[0], piles[2], ....., piles[n-2],
         * he picks first piles[0], then Lee can pick either piles[1] or piles[n - 1].
         * At very turn, Alex can always pick even indexed piles and Lee can only pick odd indexed piles.
         *
         * In the description, we know that sum(piles) is odd.
         * If sum(piles[even]) > sum(piles[odd]), Alex just picks all evens and wins.
         * If sum(piles[even]) < sum(piles[odd]), Alex just picks all odds and wins.
         *
         * So, Alex always defeats Lee in this game.
         */
        return true;
    }
}
