package test;

import main.Question5;
import main.SLNode;

public class Question5Test {

    public static void main(String arg[]) {
        Question5 obj = new Question5();

        // 321+321=642
        SLNode head = SLNodeHelperService.createSLList(1, 2, 3);
        head = obj.solutionOne(head, head);
        SLNodeHelperService.printSLNode(head);

        // 123+123=246
        head = SLNodeHelperService.createSLList(3, 2, 1);
        head = obj.solutionOne(head, head);
        SLNodeHelperService.printSLNode(head);

        // 999+999=1998
        head = SLNodeHelperService.createSLList(9, 9, 9);
        head = obj.solutionOne(head, head);
        SLNodeHelperService.printSLNode(head);

        // 90+1=91
        SLNode head1 = SLNodeHelperService.createSLList(0, 9);
        SLNode head2 = SLNodeHelperService.createSLList(1);
        head = obj.solutionOne(head1, head2);
        SLNodeHelperService.printSLNode(head);

        // 99+9=108
        head1 = SLNodeHelperService.createSLList(9, 9);
        head2 = SLNodeHelperService.createSLList(9);
        head = obj.solutionOne(head1, head2);
        SLNodeHelperService.printSLNode(head);

        // 999+9=1008
        head1 = SLNodeHelperService.createSLList(9, 9, 9);
        head2 = SLNodeHelperService.createSLList(9);
        head = obj.solutionOne(head1, head2);
        SLNodeHelperService.printSLNode(head);

        // 1+2=3
        head1 = SLNodeHelperService.createSLList(1);
        head2 = SLNodeHelperService.createSLList(2);
        head = obj.solutionOne(head1, head2);
        SLNodeHelperService.printSLNode(head);

        // 9+null=9
        head = SLNodeHelperService.createSLList(9);
        head = obj.solutionOne(head, null);
        SLNodeHelperService.printSLNode(head);

        // 1+9=10
        head1 = SLNodeHelperService.createSLList(1);
        head2 = SLNodeHelperService.createSLList(9);
        head = obj.solutionOne(head1, head2);
        SLNodeHelperService.printSLNode(head);

        // 9+0=9
        head1 = SLNodeHelperService.createSLList(9);
        head2 = SLNodeHelperService.createSLList(0);
        head = obj.solutionOne(head1, head2);
        SLNodeHelperService.printSLNode(head);
    }
}
