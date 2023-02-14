package sec04_stackandqueue.EX01_StackAndQueueMethod;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();

		// stack push ( 1, 2, 3)
		stack.push(1);
		stack.push(2);
		stack.push(3);

		// stack empty
		System.out.println(stack.empty());

		// stack top element
		System.out.println(stack.peek());

		// stack search (standard = 1)
		System.out.println(stack.search(1));

		// stack pop (3, 2, 1)
		int first_pop = stack.pop();
		int second_pop = stack.pop();
		int third_pop = stack.pop();

		System.out.println(first_pop + " " + second_pop + " " + third_pop);

		System.out.println();
		System.out.println();

		Queue<Integer> queue = new LinkedList<Integer>();

		// queue add
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println(queue);

		// queue top element
		System.out.println(queue.element());
		
		// queue remove
		queue.remove();
		System.out.println(queue);

	}

}
