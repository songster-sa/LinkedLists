package main;

/**
 * partition a SL list around a value x such that all nodes < x come before all nodes >= x
 * Example:
 * 1,2,4,6,3,7,1
 * x = 5
 * result = 1,2,4,3,1,6,7
 * <p>
 * 1,2,3,4,5,6,7
 * 7,6,5,4,3,2,1
 */
public class Question4 {

    public void solutionOne(SLNode head, int x) {

        if (head.getData() < x) {
            ascending(head, x);
        } else {
            descending(head, x);
        }

    }

    private void descending(SLNode head, int x) {
        SLNode node = head;
        SLNode prev = head;
        boolean swap = false;

        while (node.getNext() != null) {
            node = node.getNext();
            if (node.getData() < x) {
                if (!swap) {
                    swap = true;
                    prev = node;
                }
            } else if (swap) {
                // data is greater and swap is true
                int temp = prev.getData();
                prev.setData(node.getData());
                node.setData(temp);
                prev = prev.getNext();
            }
        }
    }

    private void ascending(SLNode head, int x) {

        SLNode node = head;
        SLNode prev = head;
        boolean swap = false;

        while (node.getNext() != null) {
            node = node.getNext();
            if (node.getData() >= x) {
                if (!swap) {
                    swap = true;
                    prev = node;
                }
            } else if (swap) {
                // data is lesser and swap is true
                int temp = prev.getData();
                prev.setData(node.getData());
                node.setData(temp);
                prev = prev.getNext();
            }
        }

    }


}
