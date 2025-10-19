package collections3;

import java.util.Deque;
import java.util.LinkedList;

public class Queue {
public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.addLast(10);
		deque.addLast(20);
		deque.addLast(30);
		
		System.out.println(deque);
		System.out.println(deque.removeFirst()); // Removes 10
		System.out.println(deque.removeFirst()); // Removes 20
	}
}
