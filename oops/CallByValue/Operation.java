public class Operation{
	public int data  = 100;

	public void change(int data){
		this.data = data + 100;
	}

	public static void main(String[] args) {
		Operation op = new Operation();
		System.out.println("Before call: " + op.data);
		op.change(500);
		System.out.println("After call: " + op.data);

	}
}