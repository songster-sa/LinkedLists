package test;

import main.SLNode;

public class SLNodeHelperService {

    public static void printSLNode(SLNode head) {
        SLNode node = head;
        System.out.println();

        while (node != null) {
            System.out.print(node.getData() + ", ");
            node = node.getNext();
        }
    }

    public static SLNode createSLList(int... values) {

        SLNode head = null;
        SLNode prev = head;

        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                head = new SLNode(values[0], null);
                prev = head;
            } else {
                SLNode node = new SLNode(values[i], null);
                prev.setNext(node);
                prev = node;
            }
        }
        return head;
    }
}
