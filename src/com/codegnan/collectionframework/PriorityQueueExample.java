package com.codegnan.collectionframework;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedBlockingDeque<>(2);

        deque.offerFirst("Java");
        deque.offerFirst("Python");

        System.out.println(deque);

        // addFirst()
        deque.offerFirst("c");
       // deque.addFirst("MySQL");
	}

}
