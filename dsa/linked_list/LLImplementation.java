public class LLImplementation{

	private Node head;
	private int size;
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(int data){
		Node newNode = new Node(data);
		size++;
		if(head==null){
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data){
		Node newNode = new Node(data);
		size++;
		if(head==null){
			head = newNode;
			return;
		}


		Node currNode = head;
		while(currNode.next!=null){
			currNode = currNode.next;
		}

		currNode.next = newNode;
	}

	public void deleteFirst(){
		if(head == null){
			System.out.println("LL is empty...");
			return;
		}
		size--;
		head = head.next;

	}

	public void printList(){
		if(head==null){
			System.out.println("LL is empty..");
		}

		Node currNode = head;
		while(currNode!=null){
			System.out.print(currNode.data  + " -> ");
			currNode = currNode.next;
		}
		System.out.print("\n");
	}

	public void deleteLast(){
		if(head == null){
			System.out.println("LL is empty..");
		}

		size--;
		if(head.next == null){
			head = null;
			return;
		}

		Node lastNode = head.next;
		Node secondLastNode = head;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = null;
	}

	public int getSize(){
		return this.size;
	}


	public void reverseListIterative(){


		if(head == null || head.next == null){
			return;
		}

		Node prevNode = head;
		Node currNode = head.next;

		while(currNode!=null){
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			// update nodes
			prevNode = currNode;
			currNode = nextNode;
		}

		head.next = null;
		head = prevNode; 
	}


	public Node reverseRecursive(Node head){

		if(head == null || head.next == null){
			return head;
		}

		Node newNode = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;

		return newNode;
	}

	public static void main(String args[]){
		LLImplementation ll = new LLImplementation();
		ll.addFirst(1);
		ll.addFirst(8);
		ll.addFirst(9);
		ll.addLast(11);
		ll.addFirst(14);
		ll.addLast(78);
		ll.printList();
		ll.deleteLast();
		ll.deleteFirst();
		ll.printList();
		ll.getSize();
		ll.reverseListIterative();
		ll.printList();
		ll.head = ll.reverseRecursive(ll.head);
		ll.printList();
	}
}