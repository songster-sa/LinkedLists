package test;

import main.Question2;
import main.SLNode;

public class Question2Test {

    public static void main(String arg[]) {
        Question2 obj = new Question2();

        SLNode head = SLNodeHelperService.createSLList(5, 3, 4, 7, 8, 3, 4, 1, 3);
        System.out.println(obj.solutionOne(2, head).getData());
        System.out.println(obj.solutionOne(4, head).getData());
        System.out.println(obj.solutionOne(6, head).getData());

        head = obj.solutionOne(2, null);
        System.out.println(obj.solutionOne(2, head));

        head = SLNodeHelperService.createSLList(1, 2, 3);
        System.out.println(obj.solutionOne(5, head).getData());
    }

}
