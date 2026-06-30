package com.codegnan.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			a.add(i);
		}
		System.out.println(a);
		Iterator<Integer> itr = a.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}
			
		}
		System.out.println(a);
	}

}
// limitations of iterator
// 1. both enumeration and iterator are single direction cursors only. that is we can always
// move only in the forward direction we can't move to the backward direction.
// 2. while iterating by iterator we can perfom only read and remove operations we can't
// perform relacement and addition of neew Objects.
// to overcome these limitations sunpeople introduvced the list iterator.

