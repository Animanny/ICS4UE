package binarytree;

public class StudentInfo {
	
	//Attributes
	private String firstName,lastName;
	private StudentInfo left,right; //Left and Right Values replace what used to be "Next" in a LinkedList
	private int studentNum;
	
	//Constructors
	public StudentInfo(){
		setLeft(null);
		setRight(null);
	}
	
	public StudentInfo(int key){
		studentNum = key;
		setLeft(null);
		setRight(null);
	}
	
	public StudentInfo(int key, String firstName, String lastName){
		setLeft(null);
		setRight(null);
		this.studentNum = key;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Methods
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public StudentInfo getLeft() {
		return left;
	}

	public void setLeft(StudentInfo left) {
		this.left = left;
	}

	public StudentInfo getRight() {
		return right;
	}

	public void setRight(StudentInfo right) {
		this.right = right;
	}
	

}
