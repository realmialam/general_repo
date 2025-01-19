public class Bst{

	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data){
			this.data = data;
		}
	}

	public static TreeNode buildBst(TreeNode root, int data){

		TreeNode node = new TreeNode(data);
		if(root == null){
			return node;
		}

		if(root.data > data){
			root.left = buildBst(root.left, data);
		}else if(root.data < data){
			root.right = buildBst(root.right, data);
		}


		return root;
	}

	public static void inorder(TreeNode root){
		if(root == null){
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " -> ");
		inorder(root.right);
	}

	public static boolean searchBst(TreeNode root, int key){
		if(root == null){
			return false;
		}

		int data = root.data;
		if(data == key){
			return true;
		}else if(key < data){
			return searchBst(root.left, key);
		}else{
			return searchBst(root.right, key);
		}

	}

	public static TreeNode deleteNode(TreeNode root, int key){

		if(root == null){
			return root;
		}

		int data = root.data;
		if(data == key){
			if(root.left == null && root.right == null){
				return null;
			}else if(root.left == null){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}else{
				int successor = findSuccessor(root.right);
				root.data = successor;
				root.right = deleteNode(root.right, successor);
			}
		}else if(key < data){
			root.left = deleteNode(root.left, key);
		}else{
			root.right = deleteNode(root.right, key);
		}

		return root;

	}

	public static int findSuccessor(TreeNode root){
		if(root.left == null){
			return root.data;
		}
		return findSuccessor(root.left);
	}


	public static void printInRange(TreeNode root, int x, int y){
		if(root == null){
			return;
		}

		int data = root.data;
		if(x<=data && data<=y){
			printInRange(root.left, x, y);
			System.out.print(data + " ");
			printInRange(root.right, x, y);
		}else if(x > data){
			printInRange(root.right, x, y);
		}else if(y < data){
			printInRange(root.left, x, y);
		}
	}


	public static void main(String args[]){

		int [] arr  = {5,1,3,4,2,6};
		TreeNode root = null;
		for(int i=0; i<arr.length; i++){
			root = buildBst(root, arr[i]);
		}
		
		inorder(root);
		System.out.println("key present: " + searchBst(root, 99));
		deleteNode(root, 88);
		inorder(root);
		System.out.print(" print in range: ");
		printInRange(root, 1, 4);

	}
}