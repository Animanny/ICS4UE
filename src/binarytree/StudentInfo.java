package binarytree;

public class StudentInfo {
	
	//Attributes
	private StudentInfo left,right;
	private int key;
	
	//Constructors
	public StudentInfo(){
		left = null;
		right = null;
	}
	
	public StudentInfo(int key){
		left = null;
		right = null;
		this.key = key;
	}
	
	//Methods
	
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

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	

}
