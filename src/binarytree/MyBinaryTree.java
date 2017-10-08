package binarytree;

public class MyBinaryTree {

	// Attributes
	private StudentInfo root;
	private int numInTree;

	//Constructors
	
	public MyBinaryTree(){
		//The only thing that should be done upon creating a binary tree is setting the number of items to 0
		//We do not have a value to set root to
		numInTree = 0;
	}
	
	// Methods

	public void addToTree(StudentInfo targetNode, StudentInfo toAdd) { //A function called to add to the tree; The general method is if the given node is less than the target node, put it in it's left value. Otherwise put it in the right value
		if (numInTree == 0) {
			root = toAdd; //If there are no items in the tree (e.g. of instantiation) then set the root to the given data
		} else {

			if (toAdd.getStudentNum() < targetNode.getStudentNum()) { 
				if (targetNode.getLeft() == null) {
					targetNode.setLeft(toAdd);	//IF the studentNum provided is less than the target node studentNum AND the target node's left value is null, fill the left value with the provided node 
				} else {
					addToTree(targetNode.getLeft(), toAdd);//IF the studentNum provided is less than the target node studentNum BUT the target node's left value is full, restart the process but use that left value as the new targetNode.
				}
			} else {
				if (targetNode.getRight() == null) {
					targetNode.setRight(toAdd); //IF the studentNum provided is greater than the studentNum and the target node's right value is null, fill the right value with the provided node
				} else {
					addToTree(targetNode.getRight(), toAdd);//IF the studentNum provided is greater than the given studentNum, BUT the target node's right value is full, restart the process but use that right value as the new target node.
				}
			}
		}
		numInTree++; //after successfully adding an item, increment the number of nodes in the tree by +1
	}

	public void inorder(StudentInfo targetNode) {

		if (targetNode != null) {
			inorder(targetNode.getLeft());//Effectively, as long as there's a place to go, keep going left
			System.out.println(targetNode.getStudentNum());
			inorder(targetNode.getRight());
		}

	}

	public void preorder(StudentInfo targetNode) {
		if (targetNode != null) {
			System.out.println(targetNode.getStudentNum());
			preorder(targetNode.getLeft());
			preorder(targetNode.getRight());
		}
	}

	public void postorder(StudentInfo targetNode) {
		if (targetNode != null) {
			postorder(targetNode.getLeft());
			postorder(targetNode.getRight());
			System.out.println(targetNode.getStudentNum());
		}
	}

	// Getters and Setters

	public StudentInfo getRoot() {
		return root;
	}

	public void setRoot(StudentInfo root) {
		this.root = root;
	}

	public int getNumInTree() {
		return numInTree;
	}

	public void setNumInTree(int numInTree) {
		this.numInTree = numInTree;
	}

}
