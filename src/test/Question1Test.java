package test;

import main.Question1;
import main.SLNode;

public class Question1Test {

    public static void main(String arg[]) {
        Question1 obj = new Question1();

        SLNode head = SLNodeHelperService.createSLList(5, 3, 4, 7, 8, 3, 4, 1, 3);
        head = obj.solutionOne(head);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(5, 3, 4, 7, 8, 3, 4, 1, 3);
        head = obj.solutionTwo(head);
        SLNodeHelperService.printSLNode(head);

        head = obj.solutionOne(null);
        SLNodeHelperService.printSLNode(head);

        head = obj.solutionTwo(null);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        head = obj.solutionOne(head);
        SLNodeHelperService.printSLNode(head);

        head = SLNodeHelperService.createSLList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        head = obj.solutionTwo(head);
        SLNodeHelperService.printSLNode(head);
    }

}

