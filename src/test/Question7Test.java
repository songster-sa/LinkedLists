package test;

import main.Question7;
import main.SLNode;

public class Question7Test {

    public static void main(String arg[]) {
        Question7 obj = new Question7();

        SLNode head = SLNodeHelperService.createSLList(1, 2, 3, 4, 3, 2, 1);
        System.out.println(obj.solutionOne(head));

        head = SLNodeHelperService.createSLList(1, 2, 3, 4, 4, 3, 2, 1);
        System.out.println(obj.solutionOne(head));

        head = SLNodeHelperService.createSLList(1, 1, 2, 3, 4);
        System.out.println(obj.solutionOne(head));

        head = SLNodeHelperService.createSLList(1, 1, 2, 1, 1);
        System.out.println(obj.solutionOne(head));

        head = SLNodeHelperService.createSLList(1, 2, 3, 4, 5, 3, 2, 1);
        System.out.println(obj.solutionOne(head));

        head = SLNodeHelperService.createSLList(1);
        System.out.println(obj.solutionOne(head));

        System.out.println(obj.solutionOne(null));

    }
}
