class SuperClass{ 
	
	static void staticMethod() { 
		 System.out.println("Static method in Super Class");
	}
	
	void methodOfSuperClass() { 
		System.out.println("Super class method");	
	}
	
	final void finalMethod(){ 
		System.out.println("Final method in Super Class");
	}
	
	private void privateMethod() { 
		System.out.println("Private Method in Super Class");
	}
}

class SubClass extends SuperClass{ 
	void methodOfSuperClass() { 
		System.out.println("Sub class Method");
	}
	
	static void staticMethod() { 
		System.out.println("Static method of Super class overrided");
	}
	
	//Cannot override the final method from SuperClass
	/* 
	 * final void finalMethod(){ System.out.println("Final method in Super Class");
	 * }
	 */
	
	private void privateMethod() { 
		System.out.println("Private Method in Super Class");
	}
}

public class MethodOverriding {
	static void util(SuperClass superclass)
	{
		superclass.methodOfSuperClass();
	}
	
	private static void privateMethod() { 
		System.out.println("Private method in main class");
	}

	public static void main(String[] args) {
		
		MethodOverriding.privateMethod();
		SuperClass s1 = new SuperClass();
		SuperClass s2 = new SubClass();
		SubClass s3 = new SubClass();
		util(s1);
		util(s2);
		util(s3);
		//s3.staticMethod();
		s2.staticMethod();
		/*The method privateMethod() from the type SuperClass is not visible
		s2.privateMethod();
		s3.privateMethod();*/

	}

}
