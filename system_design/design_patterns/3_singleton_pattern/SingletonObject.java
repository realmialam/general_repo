public class SingletonObject{
	private static SingletonObject singletonObject = new SingletonObject();
	private SingletonObject(){

	}
	public static SingletonObject getInstance(){
		return singletonObject;
	}
	public void getMessage(){
		System.out.println("Single object is created..." + singletonObject);
	}
}