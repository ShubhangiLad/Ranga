class SingletonEager{
	private static SingletonEager s = new SingletonEager();
	private SingletonEager() {};
	public static SingletonEager getInstance() {
		return s;
	}
}
public class SingletonEagerLoading {

	public static void main(String[] args) {
		SingletonEager.getInstance();
		System.out.println("Singleton Object created");

	}

}
