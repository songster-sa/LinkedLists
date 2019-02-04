package main;

import test.SLNodeHelperService;

/**
 * check is SL is a palindrome
 * Example:
 * 1-2-3-4-3-2-1 => yes
 * 1-2-3-4-4-3-2-1 => yes
 * 1-1-2-3-4 -> no
 * 1-1-2-1-1 -> yes
 * 1-2-3-4-5-3-2 => no
 * 1 -> yes
 */
public class Question7 {

    // store data going forward until mid - then match
    // if length is known, you can define array size to half of the length of list

    public boolean solutionOne(SLNode head) {

        int length = SLNodeHelperService.getLength(head);
        int size = length / 2;
        int[] temp = new int[size];

        SLNode node = head;

        if (node == null) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            temp[i] = node.getData();
            node = node.getNext();
        }

        if (length % 2 != 0) {
            node = node.getNext();
        }

        while (node != null) {
            if (temp[--size] != node.getData()) {
                return false;
            }
            node = node.getNext();
        }

        return true;

    }


}
