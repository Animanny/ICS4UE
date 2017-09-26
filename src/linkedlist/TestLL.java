package linkedlist;

public class TestLL {

	public static void main(String[] args) {

		MyLL linkedList = new MyLL();
		StudentInfo someStudent = new StudentInfo(235252, "Daffy", "Duck");
		linkedList.addToFront(someStudent);
		someStudent = new StudentInfo(123414, "Lola", "Bunny");
		linkedList.addToFront(someStudent);
		someStudent = null;
		linkedList.displayList();
		linkedList.removeFromRear();
		linkedList.displayList();
	}
	
}
