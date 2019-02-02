package main;

/**
 * Two numbers represented as a SL. Digits in reverse order. Return sum.
 * Example :
 * 123+123=246 => 3-2-1 + 3-2-1=> 6-4-2
 * 999+999=1998 => 9-9-9 + 9-9-9 => 8-9-9-1
 * 90+1 = 91 => 0-9 + 1 => 1-9
 * 99+9=108 => 9-9 + 9 => 8-0-1
 * 999+9=1008
 * 1+2=3
 * <p>
 * below solution does not support -ve numbers
 */
public class Question5 {

    public SLNode solutionOne(SLNode head1, SLNode head2) {
        SLNode result = new SLNode(-1, null); // head of the result list
        SLNode curr = result;

        SLNode node1 = head1;
        SLNode node2 = head2;
        int carry = 0; // carry can be 0 or 1 as 9+9+1 =19

        while (node1 != null && node2 != null) {
            int sum = node1.getData() + node2.getData() + carry;
            curr = storeSum(sum % 10, curr);
            carry = sum / 10;

            node1 = node1.getNext();
            node2 = node2.getNext();
        }
        // if both lists exhausted then just add carry to result
        // if any one list left then add carry to it and continue adding

        if (node1 == null && node2 == null && carry == 1) {
            storeSum(carry, curr);
        } else {
            processLeftoverList(node1, carry, curr);
            processLeftoverList(node2, carry, curr);
        }

        return result;
    }

    private void processLeftoverList(SLNode node, int carry, SLNode curr) {
        if (node == null) {
            return; // so the last carry if condition does not run
        }
        while (node != null) {
            int sum = node.getData() + carry;
            curr = storeSum(sum % 10, curr);
            carry = sum / 10;

            node = node.getNext();
        }
        if (carry == 1) {
            storeSum(carry, curr);
        }
    }

    private SLNode storeSum(int data, SLNode curr) {
        // the incoming sum will only be 2 digits ever as 9+9+1 = 19
        if (curr.getData() == -1) {
            // head node
            curr.setData(data);
        } else {
            SLNode node = new SLNode(data, null);
            curr.setNext(node);
            curr = node;
        }
        return curr;
    }
}
