package main;

/**
 * delete a node in the middle of the SL list, given access only to that node
 * Example:
 * list : 1,2,3,4,5
 * delete 3 -> result should look like - 1,2,4,5
 */
public class Question3 {

    // move the nodes left
    public void solutionOne(SLNode curr) {

        if (curr == null) {
            return;
        }

        SLNode prev = curr;
        while (curr.getNext() != null) {
            curr.setData(curr.getNext().getData());
            prev = curr;
            curr = curr.getNext();
        }
        // got the last node
        prev.setNext(null);
    }
}
