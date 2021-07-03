package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class DefangingAnIPAddress {

    public String defangIPaddress(String address) {
        StringBuilder defanged = new StringBuilder();
        // Loop through every character of the string
        for (char c : address.toCharArray()) {
            if (c == '.') {
                defanged.append("[.]");
            } else {
                defanged.append(c);
            }
        }
        return defanged.toString();
    }
}
