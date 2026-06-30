import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList<String> list = new ArrayList<>();

		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("JavaScript");

		// Creating ListIterator
		ListIterator<String> itr = list.listIterator();

		System.out.println("Original List : " + list);

		System.out.println("\n========= Forward Traversal =========");

		while (itr.hasNext()) {

			System.out.println("----------------------------");
			System.out.println("Next Index : " + itr.nextIndex());

			String value = itr.next(); // Move forward

			System.out.println("Element : " + value);

			// Replace Python with Python3
			if (value.equals("Python")) {
				itr.set("Python3");
				System.out.println("Python replaced with Python3");
			}

			// Add SQL after C
			if (value.equals("C")) {
				itr.add("SQL");
				System.out.println("SQL Added");
			}

			// Remove JavaScript
			if (value.equals("JavaScript")) {
				itr.remove();
				System.out.println("JavaScript Removed");
			}
		}

		System.out.println("\nList After Forward Traversal");
		System.out.println(list);

		System.out.println("\n========= Backward Traversal =========");

		while (itr.hasPrevious()) {
			System.out.println("----------------------------");

			System.out.println("Previous Index : " + itr.previousIndex());

			System.out.println("Element : " + itr.previous());
		}

		System.out.println("\nFinal List");
		System.out.println(list);
	}
}