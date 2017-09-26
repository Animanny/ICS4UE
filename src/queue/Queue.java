/*
 * A FIFO LinkedList
 */


package queue;

public class Queue {

	
	//Attributes
	StudentInfo FirstInList = null;
	StudentInfo LastInList = null;
	int numItems = 0;

	
	//Methods
	public void enqueue(StudentInfo toAdd) {
		if (numItems == 0) {
			FirstInList = toAdd;
			LastInList = toAdd;
		} else {
			LastInList.setNext(toAdd);
			LastInList = toAdd;
		}
		numItems++;
	}
	
	public void deqeueue(){
		if (numItems == 0){
			System.out.print("Nothing to remove");
		} else {
			FirstInList = FirstInList.getNext();
		}
	}
	
	public void peek(){
		System.out.println("First in Queue:");
		System.out.println(FirstInList.getFirstName());
		System.out.println(FirstInList.getLastName());
		System.out.println(FirstInList.getStudentNumber());
	}
}
