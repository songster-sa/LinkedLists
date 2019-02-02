package test;

import main.Question3;
import main.SLNode;

public class Question3Test {
    public static void main(String arg[]) {
        Question3 obj = new Question3();

        // remove from middle
        SLNode head = SLNodeHelperService.createSLList(1, 2, 3, 4, 5);
        obj.solutionOne(head.getNext().getNext());
        SLNodeHelperService.printSLNode(head);

        // remove first
        head = SLNodeHelperService.createSLList(1, 2, 3, 4, 5);
        obj.solutionOne(head);
        SLNodeHelperService.printSLNode(head);

        // remove last
        head = SLNodeHelperService.createSLList(1, 2, 3, 4, 5);
        obj.solutionOne(head.getNext().getNext().getNext().getNext());
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(1);
        obj.solutionOne(head);
        SLNodeHelperService.printSLNode(head);

        obj.solutionOne(null);

    }
}
