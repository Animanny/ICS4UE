package binarytree;

import java.util.Scanner;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyBinaryTree b = new MyBinaryTree();
		int input = 0;

		Scanner sc = new Scanner(System.in);
		while (input >= 0) {
			System.out.println("Enter a number: ");
			input = sc.nextInt();
			if (input >= 0) {
				StudentInfo toAdd = new StudentInfo(input);
				b.addToTree(b.getRoot(), toAdd);
			}
		}
		
		System.out.println("Number of Items in List: ");
		System.out.println(b.getNumInTree());
		System.out.println("Inorder Traversal");
		b.inorder(b.getRoot());
		System.out.println("PreOrder Traversal");
		b.preorder(b.getRoot());
		System.out.println("PostOrder Traversal");
		b.postorder(b.getRoot());

	}

}
