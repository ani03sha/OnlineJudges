package org.redquark.onlinejudges.leetcode.list;

import org.redquark.onlinejudges.leetcode.common.ListNodeWithRandom;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class CopyListWithRandomPointer {

    public ListNodeWithRandom copyRandomList(ListNodeWithRandom head) {
        // Special case
        if (head == null) {
            return null;
        }
        // Map to store the mapping of original node and clone node
        Map<ListNodeWithRandom, ListNodeWithRandom> nodeMap = new HashMap<>();
        // Head of the clone list
        ListNodeWithRandom cloneHead = null;
        // Pointer to traverse through the original list
        ListNodeWithRandom temp = head;
        // Pointer to traverse through the clone list
        ListNodeWithRandom cloneTemp = null;
        // Loop through the original list
        while (temp != null) {
            // Create a deep copy of the current original node
            ListNodeWithRandom copy = new ListNodeWithRandom(temp.val);
            // Check if the head has already been created
            if (cloneHead == null) {
                cloneHead = copy;
                cloneTemp = cloneHead;
            } else {
                cloneTemp.next = copy;
                cloneTemp = cloneTemp.next;
            }
            // Put the mapping in the map
            nodeMap.put(temp, cloneTemp);
            temp = temp.next;
        }
        // Reset the traversing pointers
        temp = head;
        cloneTemp = cloneHead;
        // Loop again to fix random pointers
        while (temp != null) {
            // Check if the random node exists
            if (temp.random != null) {
                cloneTemp.random = nodeMap.get(temp.random);
            }
            temp = temp.next;
            cloneTemp = cloneTemp.next;
        }
        return cloneHead;
    }
}
