public class CustomStack{

	private int capacity;
	private int top;
	private int [] stack;
	public CustomStack(int capacity){
		this.top = -1;
		this.capacity = capacity;
		this.stack = new int [this.capacity];
	}

	public static void main(String args[]){
		CustomStack st = new CustomStack(10);
		for(int i=0; i<12; i++){
			st.push(i+1);
		}

		for(int i=0; i<11; i++){
			st.pop();
		}
	}


	private void push(int data){

		
		if(isFull(this.top)){
			System.out.println("Stack is full..");
			return;
		}
		
		this.stack[++top] = data;
		System.out.println(data + " added into the stack successfully..");

	}

	private void pop(){

		if(isEmpty()){
			System.out.println("Stack is empty...");
			return;
		}

		int data = this.stack[top--];
		System.out.println(data  + " has been poped out from the stack successfully...");
	}

	private int peek(){
		if(isEmpty()){
			System.out.println("Stack is empty...");
			return -1;
		}

		int data = this.stack[top];
		System.out.println(data  + " has been peek from the stack successfully...");
		return data;
	}

	private boolean isFull(int top){
		if(++top >= this.capacity){
			return true;
		}

		return false;

	}

	private boolean isEmpty(){

		if(top <= -1){	
			return true;
		}

		return false;

	}

	



}