import java.util.Scanner;
import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class CreateTree{


	public static void main(String args[]){

		CreateTree tree = new CreateTree();
		Node rootNode = tree.createTree();
		tree.preorder(rootNode);

		int height = tree.height(rootNode);

		System.out.println("Height of tree: " + height);

		for(int i=1; i<=height; i++){
			System.out.print("Level_" + i + ":");
			tree.levelOrderRecursive(rootNode, i);
			System.out.println();

		}
		System.out.println("Iterative level order output: ");
		tree.levelOrderIterative(rootNode);
			
		System.out.println("\nNumber of nodes: " + tree.countNodes(rootNode));

		System.out.println("\n Sum of all nodes: " + tree.sumNodes(rootNode));

		System.out.println("Diameter of a tree: " + tree.diameter(rootNode));
		
		System.out.println("Fast Diameter of a tree: " + tree.fastDiameter(rootNode).diameter);

		System.out.print("\nRight view of the tree: ");
		tree.rightViewIterative(rootNode);

		System.out.println("\n Right view recursive: ");
		tree.rightViewRecursive(rootNode, 1, new int []{0});

		System.out.println("\n LCA: " + tree.lca1(rootNode));


		System.out.println("\nInorder traversal: ");
		tree.inorder(rootNode);

		System.out.println("\nTree to Double LL: ");
		

		Wrapper obj = tree.getWrapperInstance();
		tree.convertToDoubleLinkedList(rootNode, obj);
		tree.displayDLL(obj.head);

		


		
	}


	private Node createTree(){

		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		if(val == -1) { return null;}

		Node root = new Node(val);
		root.left = createTree();
		root.right = createTree();
		return root;
	}

	private void preorder(Node node){
		
		if(node == null)
			return;
	
		System.out.print(node.data + " -> ");
		preorder(node.left);
		preorder(node.right);

	}

	private int height(Node root){

		if(root == null){
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return Math.max(leftHeight , rightHeight) + 1;

	}

	private void levelOrderRecursive(Node root, int level){
		if(root == null){ return;}

			
		if(level == 1){
			System.out.print(root.data + " -> ");
			return;
		}

		levelOrderRecursive(root.left, level-1);
		levelOrderRecursive(root.right, level-1);

		
		
	}

	private void levelOrderIterative(Node root){
		if(root == null){ return;}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		while(!queue.isEmpty()){

			Node node = queue.poll();
			
			if(node == null){


				if(!queue.isEmpty()){

					queue.add(null);
					System.out.println();
				}
				
			}else{

				System.out.print(node.data + " -> ");
				if(node.left!=null){
					queue.add(node.left);
				
				}
				if(node.right!=null){
					queue.add(node.right);
				
				}

			}

		}
		
	}

	private int countNodes(Node root){

		if(root == null){ return 0;}
			
		int left = countNodes(root.left);
		int right = countNodes(root.right);
		
		return left + right + 1;

	}

	private int sumNodes(Node root){
		if(root == null){

			return 0;
		}

		int left = sumNodes(root.left);
		int right = sumNodes(root.right);
		
		return left + right + root.data;

	}
	
	private int diameter(Node root){
		
		if(root == null){return 0;}

		int leftH = height(root.left);
		int rightH = height(root.right);

		int y = Math.max(diameter(root.left), diameter(root.right));

		return Math.max((leftH + rightH), y);

	}

	private HeightDiameter fastDiameter(Node root){

		if(root == null){ 

			return new HeightDiameter(0,0);
		}

		HeightDiameter leftSide = fastDiameter(root.left);
		HeightDiameter rightSide = fastDiameter(root.right);

		int diameter = Math.max((leftSide.height + rightSide.height), Math.max(leftSide.diameter, rightSide.diameter));

		
		return new HeightDiameter(Math.max(leftSide.height, rightSide.height) + 1, diameter);
		

	}

	private void rightViewIterative(Node root){

		if(root == null){ return;}

		Queue<Node> qq = new LinkedList<>();
		
		qq.add(root);
		qq.add(null);

		while(!qq.isEmpty()){

			Node node = qq.poll();
			if(node == null){

				if(!qq.isEmpty()){

					qq.add(null);
				}

			}else{

				Node nextNode = qq.peek();
				if(nextNode == null){
					System.out.print(node.data + " >");
				}

				if(node.left != null){

					qq.add(node.left);
				}

				if(node.right != null){

					qq.add(node.right);

				}


			}

		}

	}

	private void rightViewRecursive(Node root, int currLevel, int [] maxLevel){

		if(root == null){ return;}

		if(currLevel > maxLevel[0]){

			System.out.print(root.data + " >");
			maxLevel[0] = currLevel;

		}

		rightViewRecursive(root.right, currLevel + 1, maxLevel);
		rightViewRecursive(root.left, currLevel + 1, maxLevel);

		

		
		
	}


	private Node allAncestor(Node root, int value, List<Integer> ancestorList){

		if(root == null) {

			return null;
		}
		
		if(root.data == value){
			ancestorList.add(root.data);
			return root;
		}
	

		
		Node left = allAncestor(root.left, value, ancestorList);
		Node right = allAncestor(root.right, value, ancestorList);


		if(left != null || right != null){

			ancestorList.add(root.data);
			return (left!= null)	 ? left : right;
		}

		return null;

		
		

	}

		
	private int lca1(Node root){
		System.out.println("\n Enter two value for descendants: ");
		System.out.print("\nValue1: ");
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();

		System.out.print("\nValue2: ");
		int value2 = sc.nextInt();

		List<Integer> list1 = new ArrayList<>();

		allAncestor(root, value1, list1);

		List<Integer> list2 = new ArrayList<>();

		allAncestor(root, value2, list2);

		int len = list1.size() > list2.size() ? list2.size() :  list1.size();

			
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
		
		int lowestCommon = -1;
		for(int i=0; i<len; i++){

			int element = list1.get(i);
			if(list2.contains(element)){
				return element;
				
			}

		}
		return -1;

		
	}

	private void convertToDoubleLinkedList(Node root, Wrapper obj){

		if(root == null){

			return;
		}
		
		convertToDoubleLinkedList(root.left, obj);
		if(obj.prev == null){
			obj.head = root;
		}else{

			obj.prev.right = root;
			root.left = obj.prev;
		}

		obj.prev = root;
		
		convertToDoubleLinkedList(root.right, obj);

		
		

	}

		
	private void inorder(Node root){
		
		if(root == null){
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	
	}

	private void displayDLL(Node head){

		if(head == null){
			System.out.println("\n Head is null..");
			return;
		}

		Node temp = head;
		while(temp!=null){

			System.out.print(temp.data + " ");		
			temp = temp.right;

		}

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
	
	private Wrapper getWrapperInstance(){
		return new Wrapper();
	}

	class HeightDiameter{
		private int height;
		private int diameter;
		public HeightDiameter(int height, int diameter){
			this.height = height;
			this.diameter = diameter;
			
		}
	}

	class Wrapper{

		private Node head;
		private Node prev;

	}


}





