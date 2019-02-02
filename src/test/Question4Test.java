package test;

import main.Question4;
import main.SLNode;

public class Question4Test {

    public static void main(String args[]) {
        Question4 obj = new Question4();

        SLNode head = SLNodeHelperService.createSLList(1, 2, 1, 6, 7, 2, 3);
        obj.solutionOne(head, 5);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(1, 7, 2, 6, 3, 8, 4, 9);
        obj.solutionOne(head, 5);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(7, 1, 2, 1, 6, 7, 2, 3);
        obj.solutionOne(head, 5);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(7, 1, 7, 2, 6, 3, 8, 4, 9);
        obj.solutionOne(head, 5);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        obj.solutionOne(head, 5);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        obj.solutionOne(head, 5);
        SLNodeHelperService.printSLNode(head);

        System.out.println("\nAlways ascending ... :");
        // always ascending
        head = SLNodeHelperService.createSLList(1, 7, 2, 6, 3, 8, 4, 9);
        obj.solutionTwo(head, 5);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(9, 8, 7, 6, 5, 4, 3, 2, 1);
        obj.solutionTwo(head, 5);
        SLNodeHelperService.printSLNode(head);

    }
}
