
public class Sample_Inheritance {
	
	public static void main(String [] args)
	{
		B2 b = new B2();
		b.m1();
	}

}

class A2 { 
	
	int i;
	{
		System.out.println("I am in IIB");
	}
	
	static { 
		System.out.println("I am in SIB");
	}
	
	
	 A2(){ System.out.println("I am default constructor of class A"); }
	 
	
	A2(int i){ 
		//B2();
		System.out.println("I am parameterized constructor of class A");
	}
	public void m1() { 
		 System.out.println("I am in Class A");
	}
	
	
	
}

class B2 extends A2 { 
	
	B2(){}
	
	/*
	 * public B2() { super(10); }
	 */
	int j;
	public void m1() { 
		System.out.println("I am in Class B");
	}
}

//Example for Multiple Inheritance
/*
 * class C2 extends A2,B2{
 * 
 * C2(){ super(20); }
 * 
 * public void m1() { System.out.println("Multiple Inheritance"); } }
 */