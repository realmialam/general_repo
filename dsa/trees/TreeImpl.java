
import java.util.*;

public class TreeImpl{

	public static int idx = -1;
	static class Node{
		int data;
		Node left;
		Node right;

		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}

		
	}

	static class DiameterHeight{
		int height;
		int diameter;

		public DiameterHeight(int height, int diameter){
			this.height = height;
			this.diameter = diameter;
		}
	}
	public static Node createTree(int [] arr){
		idx++;
		int data = arr[idx];
			if(data == -1){
				return null; 
			}

			Node node = new Node(data);
			
				node.left = createTree(arr);
				node.right = createTree(arr);
	
			return node;

		}

	public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	public static void inorder(Node root){
		if(root==null){
			return;
		}
		
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public static void postorder(Node root){
		if(root==null){
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}

	public static void levelOrder(Node root){
		Queue<Node> queue = new LinkedList<>();
		if(root == null){
			return;
		}

		queue.add(root);
		queue.add(null);

		while(!queue.isEmpty()){

			if(queue.size()==1 && queue.peek()==null){
				queue.remove();
			}else{
				Node node = queue.remove();

				if(node == null){
					// System.out.print("\n");
					queue.add(null);
				}else{
					System.out.print(node.data + " -> ");
					if(node.left != null){
						queue.add(node.left);
						System.out.println("left: " + node.left.data);
					}
					if(node.right != null){
						queue.add(node.right);
						System.out.println("right: " + node.right.data);
					}
				}

				
			}
		}

	}

	public static int countNodes(Node root){
		if(root == null){
			return 0;
		}

		int left = countNodes(root.left);
		int right = countNodes(root.right);

		return left + right + 1;
	}

	public static int height(Node root){
		if(root == null){
			return 0;
		}

		int left = height(root.left);
		int right = height(root.right);

		return Math.max(left , right) + 1;
	}

	public static int sum(Node root){
		if(root==null){
			return 0;
		}

		int left = sum(root.left);
		int right = sum(root.right);

		return left + right + root.data;
	}


	public static DiameterHeight diamterOfTree(Node root){


		if(root == null){
			int height = 0;
			int diameter = 0;

			return new DiameterHeight(height, diameter);
		}

		DiameterHeight d1 = diamterOfTree(root.left);
		DiameterHeight d2 = diamterOfTree(root.right);

		int height = Math.max(d1.height, d2.height) + 1;

		DiameterHeight d3 = new DiameterHeight(height, d1.height + d2.height + 1);

		
		int diameter = Math.max(d1.diameter, Math.max(d2.diameter, d3.diameter));

		DiameterHeight diameterHeight = new DiameterHeight(height, diameter);

		return diameterHeight;


	}



	public static void main(String args[]){
		int [] arr = {1,2,4,-1,-1,5,6,-1,-1,-1,3,-1,-1};
		Node root = null;
		root = createTree(arr);
		
		preorder(root);
		System.out.println("\n");
		postorder(root);
		System.out.println("\n");
		inorder(root);
		System.out.println("\n");
		levelOrder(root);

		System.out.println("count.." + countNodes(root));

		System.out.println("height.." + height(root));

		System.out.println("summ.." + sum(root));

		DiameterHeight diameterHeight = diamterOfTree(root);
		System.out.println("diameter: " + diameterHeight.diameter);
		System.out.println("height: " + diameterHeight.height);

	}

}