package tests.datastructures.stack;

import com.datastructures.stack.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.push(50);
        stk.push(40);
        stk.push(30);
        stk.push(20);

        System.out.println(stk.pop());
        System.out.println(stk.pop());

        System.out.println(stk.isEmpty());

        System.out.println(stk.size());

        System.out.println(stk);
    }

}
