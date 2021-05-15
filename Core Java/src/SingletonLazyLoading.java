class SingletonLazy{
	private static SingletonLazy s;
	private SingletonLazy() {
		System.out.println("Instance is created");
	};
	public static SingletonLazy getInstance() {
		
		synchronized(SingletonLazyLoading.class) {
		if(s==null) {
			s = new SingletonLazy();
		}
		return s;
		}
	}
	
}
public class SingletonLazyLoading {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> SingletonLazy.getInstance());
		
		Thread t2 = new Thread(() -> SingletonLazy.getInstance());
		
		t1.start();
		
		t2.start();
		
		SingletonLazy.getInstance();
		//System.out.println("Singleton object created");
	}
	

}
