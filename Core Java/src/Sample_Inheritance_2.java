
public class Sample_Inheritance_2 {

	public static void main(String[] args) { 
		
		B3 b = new B3();
		
	}
}

class A3{ 
	
	static {
		System.out.println("Static Block of A3");
	}
	
	{ 
		System.out.println("IIB Block of A3");
	}
	
	public A3() { 
		System.out.println("Constructor of A3");
	}
	
}

class B3 extends A3{
	
	//System.out.println("Simple statement in B3");
	
	static {
		System.out.println("Static Block of B3");
	}
	
	{ 
		System.out.println("IIB Block of B3");
	}
	
	public B3() { 
		System.out.println("Constructor of B3");
	}
	
	
}
