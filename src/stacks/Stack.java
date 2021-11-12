/*
 * This version of a linked list follows the FIFO design
 */

package stacks;

public class Stack {

	
	//Attributes
	StudentInfo TOS = null;
	int numItems = 0;

	
	//Methods
	public void push(StudentInfo toAdd) {
		if (numItems == 0){
			
			TOS = toAdd;
			
		} else {
			TOS.setNext(toAdd);
			TOS = toAdd;
		}

		numItems++;
	}
	
	public void pop(){
		if (numItems == 0){
			System.out.println("There are no items in the list!");
			return;
		}
		TOS = TOS.getNext();
		numItems--;
		
		
	}
	
	public void peek(){
		System.out.println("Top of Stack:");
		System.out.println(TOS.getFirstName());
		System.out.println(TOS.getLastName());
		System.out.println(TOS.getStudentNumber());
	}
}
