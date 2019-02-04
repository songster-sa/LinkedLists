package main;

import test.SLNodeHelperService;

/**
 * Two numbers represented as a SL. Digits in order. Return sum.
 * Example :
 * 123+123=246 => 1-2-3 + 1-2-3=> 2-4-6
 * 999+999=1998 => 9-9-9 + 9-9-9 => 1-9-9-8
 * 90+1 = 91 => 9-0 + 1 => 9-1
 * 99+9=108 => 9-9 + 9 => 1-0-8
 * 999+9=1008
 * 1+2=3
 * <p>
 * below solution does not support -ve numbers
 */
public class Question5a {

    // if its a doubly linked list - easier as we can go back to front and use similar logic to Question5
    // otherwise, we can use a stack or array ... to keep storing the sum of the nodes in order and then pop it to handle the carry
    // but will have to make both SL of same length by adding 0 to the front

    public SLNode solutionOne(SLNode head1, SLNode head2) {
        SLNode result = new SLNode(-1, null); // head of the result list
        SLNode curr = result;

        SLNode node1 = head1;
        SLNode node2 = head2;

        int length1 = SLNodeHelperService.getLength(node1); // O(n)
        int length2 = SLNodeHelperService.getLength(node2); // O(m)

        // make them both same size
        if (length1 > length2) {
            node2 = addZeros(node2, length1 - length2);
        } else {
            node1 = addZeros(node1, length2 - length1);
        }

        // create array to save sum
        int size = length1 > length2 ? length1 : length2;
        int[] sumArray = new int[size];

        int i = 0;
        while (node1 != null && node2 != null) {  // O(n) where n >= m
            sumArray[i++] = node1.getData() + node2.getData();
            node1 = node1.getNext();
            node2 = node2.getNext();
        }

        int carry = 0;
        for (int j = size - 1; j >= 0; j--) { // O(n) where n >= m
            int sum = sumArray[j] + carry;
            sumArray[j] = sum % 10;
            carry = sum / 10;
        }

        // create result list
        if (carry == 1) {
            curr = storeSum(carry, curr);
        }
        for (int k : sumArray) {
            curr = storeSum(k, curr);
        }

        return result;
    }

    private SLNode addZeros(SLNode node, int i) {
        if (i == 0) {
            return node;
        }
        while (i != 0) {
            SLNode head = new SLNode(0, null);
            head.setNext(node);
            node = head;
            i--;
        }
        return node;
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

