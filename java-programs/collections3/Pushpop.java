package collections3;

import java.util.Stack;

public class Pushpop {
public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack);

		System.out.println(stack.pop());// Removes C
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		}
	}
