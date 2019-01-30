package main;

/**
 * find kth to last element in SL List
 * Example:
 * 1,2,3,4,5 = 2nd last = 4
 * what to return is length is less that k ? - head
 */
public class Question2 {

    // from starting, if the next kth element is null, then current is kth last element
    // ie 4.next.next == null

    public SLNode solutionOne(int k, SLNode head) {
        if (head == null) {
            return head;
        }

        SLNode prev = head;
        SLNode curr = getKthNode(k, head);

        while (curr != null)

        {
            prev = prev.getNext();
            curr = curr.getNext();
        }

        return prev;

    }

    private SLNode getKthNode(int k, SLNode node) {

        for (int i = 0; i < k; i++) {
            node = node.getNext();
            if (node == null) {
                return node;
            }
        }
        return node;
    }
}
