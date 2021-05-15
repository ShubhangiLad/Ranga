
public class EagerLoading {

	public static void main(String[] args) {
		
		Singleton_EagerLoading obj1 = Singleton_EagerLoading.getInstance();
		Singleton_EagerLoading obj2 = Singleton_EagerLoading.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}

}

class Singleton_EagerLoading{    
	
	private static Singleton_EagerLoading obj = new Singleton_EagerLoading();
	private Singleton_EagerLoading() {}
	
	public static Singleton_EagerLoading getInstance()
	{
		return obj;
	}
}
