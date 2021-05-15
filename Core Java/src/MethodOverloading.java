class A5{ 
	
	A5(){ 
		System.out.println("I am in A5");
	}
	
	void m1() {     
		System.out.println("I am in Method of A5");
	}
	
	void m1(int i,int j) {     
		System.out.println("I am in Method of A5 - i,j");
	}
	
}

class B5 extends A5 { 
	B5(){
		System.out.println("I am in B5");
	}
	
	//The Method m1(int i) is undefined for class A
	/*
	 * void m1(int i) { System.out.println("I am in Method of B5 "); }
	 */
}

public class MethodOverloading {

	public static void main(String[] args) {
		B5 a = new B5();
		a.m1(10,20);
		//a = new B5();

	}

}
