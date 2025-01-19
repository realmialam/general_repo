public class CustomLinkedList{

	private Node head;

	public static void main(String args[]){
		
		CustomLinkedList ll = new CustomLinkedList();
		ll.display();
		for(int i=0; i<7; i++){

			ll.add(i+3);
		
		}

		for(int i=7; i<10; i++){

			ll.addAtHead(i+3);
		
		}

		ll.display();
		System.out.println("Reversing the LL..");
		ll.head = ll.reverseHead();
		ll.display();
		
		System.out.println("Reversing the LL.. recursive..");
		ll.head = ll.reverseRecursive(ll.head);
		ll.display();
		
		

	}

	private Node add(int data){
		
		Node node = new Node(data);
		if(head == null){
			
			head = node;
			return head;
		}

		Node temp = head;

		while(temp!=null && temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
		return head;
		
	}

	private Node addAtHead(int data){
		Node node = new Node(data);
		if(this.head == null){
			this.head = node;
			return this.head;
		}

		node.next = this.head;
		this.head = node;
		return this.head;
	}

	

	private void display(){

		if(this.head == null){
			System.out.println(" Linked list is empty...");
		}

		Node temp = this.head;
		while(temp!=null){
			System.out.print(temp.data + " -> " );
			temp = temp.next;
		}
	}

		
	private Node reverseHead(){
		
		if(this.head == null){

			System.out.println("Linked list is empty..");
			return null;
		}

		Node prev = null;
		Node curr = this.head;
		Node forward = null;

		while(curr != null){

			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;

		}

		return prev;
		
	}

	private Node reverseRecursive(Node head){
		
		if(head.next == null || head == null){
			return head;
		}

		Node reversedHead = reverseRecursive(head.next);
		Node curr = head;
		curr.next.next = curr;
		curr.next = null;
		return reversedHead;
		
	}

	class Node{
		
		private int data;
		private Node next;

		public Node(){}
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	
	}

	



}












