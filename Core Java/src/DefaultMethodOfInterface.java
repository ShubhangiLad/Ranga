interface First{ 
	default void m1() { 
		System.out.println("Method of first");
	}
}

interface Second{    
	default void m1() {
		System.out.println("Method of Second");
	}
}
public class DefaultMethodOfInterface implements First,Second{
	public void m1() { 
		System.out.println("Method of class");
	}
	
	public static void main(String[] args) {
		DefaultMethodOfInterface di = new DefaultMethodOfInterface();
		di.m1();
		
	}

}
