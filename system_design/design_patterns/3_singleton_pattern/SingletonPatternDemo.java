public class SingletonPatternDemo{
	public static void main(String []args){
		SingletonObject singletonObject = SingletonObject.getInstance();
		singletonObject.getMessage();

		SingletonObject singletonObject2 = SingletonObject.getInstance();
		singletonObject2.getMessage();
	}
}