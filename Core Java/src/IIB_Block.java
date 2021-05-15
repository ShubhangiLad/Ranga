
public class IIB_Block {
	
	{
		m1();
	}
	
	static { 
	//	m1();
	}
	


	public static void main(String[] args) {
		IIB_Block b = new IIB_Block();
		IIB.staticMethod();
		IIB iib1 = new IIB();
		System.out.println("Inside main method");
	
		IIB iib2 = new IIB(10);
		

	}
	
	public void m1() { 
		System.out.println("Inside method one");
	}

}

class IIB{ 
	{
	//	m1();
		System.out.println("Inside IIB block");
	}
	
	static
	{
		
		System.out.println("Inside static block");
	}
	
	static void staticMethod(){ 
		System.out.println("Inside Static Method");
	}
	
	IIB(){                  
		System.out.println("Inside default Constructor");
	}
	
	IIB(int i){
		System.out.println("Inside parameterized Constructor");
	}
}
