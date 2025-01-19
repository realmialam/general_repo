public class CustomQueue<T>{

	private int front; // points to the index where new elements are supposed to be inserted..
	private int rear; // points to the index from where elements are to be dequed..
	private int max_size; // it stores the max number of elements that can be stored..
	private int curr_size;

	private T [] queue; // An array that stores the elements of T types..

	public CustomQueue(int max_size){
		this.max_size = max_size;
		this.curr_size = 0;
		this.front = -1;
		this.rear = -1;
		this.queue = (T[])new Object[max_size];
		
	}

	public static void main(String args[]){
		
		CustomQueue<Integer> qq = new CustomQueue<> (10);
		for(int i=0; i<5; i++){
			qq.enque(i+5);
		}
		for(int i=0; i<3; i++){
			qq.deque();
		}
		
		
	}

	private void enque(T data){

		if(isFull()){
			System.out.println("queue is full..");
			return;
		}

		this.rear = (this.rear + 1)%max_size;
		this.queue[this.rear] = data; 
		if(this.front == -1){
			this.front = 0;
		}
		curr_size++;
		System.out.println(data + " has been inserted into the queue..");
	}

	private void deque(){

		if(isEmpty()){

			System.out.println("Queue is empty..");
			return;
		}
		System.out.println(this.queue[this.front] + " is dequed from the queue..");
		this.front = (this.front + 1)%max_size;
		curr_size--;
		if(curr_size==0){
			this.front = -1;
			this.rear = -1;
		}

	}

	private T peek(){
		if(isEmpty()){

			System.out.println("Queue is empty..");
			return null;
		}
		
		return queue[this.front];
		
	}

	private boolean isFull(){
		return curr_size == max_size;

	}

	private boolean isEmpty(){
		return curr_size <= 0;
	}


	
	
	


}