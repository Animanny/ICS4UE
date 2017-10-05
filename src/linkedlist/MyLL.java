package linkedlist;

public class MyLL {
	StudentInfo frontOfList = null;
	StudentInfo rearOfList = null;
	StudentInfo current;
	public static int numItems = 0;

	public void addToFront(StudentInfo toAdd) {
		if (frontOfList == null) {
			numItems++;
			frontOfList = toAdd;
			rearOfList = toAdd;
		} else {
			toAdd.setNext(frontOfList);
			numItems++;
			frontOfList = toAdd;
		}
		System.out.println("Successfully added");
	}

	public void removeFromRear() {
		if (rearOfList == null) {

		} else {
			current = frontOfList;
			for (int x = 1; x < numItems; x++) {
				current.setNext(current.getNext());
			}
			numItems--;
			current.setNext(null);
		}
		System.out.println("\n"+"Successfully Removed");

	}

	public void displayList() {
		System.out.println("");

		current = frontOfList;
		for (int x = 1; x <= numItems; x++) {
			System.out
					.println(current.getFirstName() + " " + current.getLastName() + " - " + current.getStudentNumber());

			current = current.getNext();
		}
	}
}
