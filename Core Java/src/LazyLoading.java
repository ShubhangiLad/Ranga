
public class LazyLoading {

	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable()
				{                           
					public void run()
					{
						Singleton_LazyLoading obj = Singleton_LazyLoading.getInstance();
					}
				});
		
		Thread t2 = new Thread(new Runnable()
		{                           
			public void run()
			{
				Singleton_LazyLoading obj2 = Singleton_LazyLoading.getInstance();
			}
		});
		
		t1.start();
		/*
		 * try {Thread.sleep(10);} catch(Exception e) {}
		 */
		t2.start();
	}
	}


class Singleton_LazyLoading {
	
	private static Singleton_LazyLoading obj;
	private Singleton_LazyLoading() {
		System.out.println("Instance created");
	}
	

	public static Singleton_LazyLoading getInstance()
	{
		if(obj==null)
			synchronized(Singleton_LazyLoading.class)
			{
				if(obj==null)
				obj = new Singleton_LazyLoading();
			}
		return obj;
	}
	
}