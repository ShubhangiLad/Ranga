package test;

 class AccessModifiers {

	public static void main(String[] args) {
		/*
		 * B1 b = new B1(); b.methodOfClassB1();
		 */
		
		
		 C1 c = new C1(); 
		 c.methodOfClassC1();
		 
	}

}

class B1 extends A1{  
	void methodOfClassB1() { 
		System.out.println("Inside class B1");
		//System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}

class C1 extends B1{ 
	void methodOfClassC1() { 
		System.out.println("Inside class C1");
		//System.out.println(i);
		/*
		 * System.out.println(j); System.out.println(k); System.out.println(l);
		 */
		
		//B1 b = new B1();
		//System.out.println(b.i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}