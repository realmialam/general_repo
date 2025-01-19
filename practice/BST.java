import java.util.Scanner;

public class BST{


	public static void main(String args[]){

		BST bst = new BST();
		Node rootNode = bst.createBST();
		bst.inorder(rootNode);

		
	}


	private Node bstHelper(Node root, int value){
		if(root == null){
			return new Node(value);
		}

		if(root.data < value){

			root.right = bstHelper(root.right, value);
		}else{
			root.left = bstHelper(root.left, value);
		}

		return root;

		
	}

	private Node createBST(){

		Node root = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Enter value: ");
		int value = sc.nextInt();
		while(value!=-1){

			root = bstHelper(root, value);
			value = sc.nextInt();

			
		}

		return root;	
		
	}

	private void inorder(Node root){

		if(root == null){
			return;
		}

		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);

	}

	class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int data){

			this.data = data;
			this.left = null;
			this.right = null;
		}

	}


}