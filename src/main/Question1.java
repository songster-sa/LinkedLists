package main;

import java.util.HashSet;
import java.util.Set;

/**
 * remove duplicates from an unsorted linked list
 * follow up - do not use a temp buffer
 */
public class Question1 {

    // solution 1 - sort it and then iterate again - insertion sort - inplace - but the list will change
    // solution 2 - layman - do nxn iterations checking each element one at a time
    // solution 3 - keep track of already seen elements - iterate only once

    public SLNode solutionOne(SLNode head) {
        if (head == null) {
            return head;
        }
        Set elements = new HashSet();
        elements.add(head.getData());

        SLNode curr = head;
        SLNode prev = head;

        while (curr.getNext() != null) {
            prev = curr;
            curr = curr.getNext();
            if (!elements.add(curr.getData())) {
                // add not successful - mean a duplicate found
                curr = curr.getNext();
                prev.setNext(curr);
                curr = prev;
            }
        }
        return head;
    }

    public SLNode solutionTwo(SLNode head) {
        SLNode node = head;
        SLNode prev, curr;

        while (node != null) { // for each element
            prev = node;
            curr = node.getNext();
            while (curr != null) { // iterate the rest of the list
                if (curr.getData() == node.getData()) {
                    // duplicate found
                    prev.setNext(curr.getNext());
                } else {
                    prev = curr;
                }
                curr = curr.getNext();
            }
            node = node.getNext();
        }
        return head;
    }
}
