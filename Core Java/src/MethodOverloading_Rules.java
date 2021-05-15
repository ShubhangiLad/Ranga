public class MethodOverloading_Rules {
	
	void methodOverloaded() {             
		System.out.println("No argument, return type is void");
	}
	
	void methodOverloaded(int i) { 
		System.out.println("One argument passed");
	}
	
	String methodOverloaded(int i, int j) { 
		return "Shubhangi";
	}
	
	protected static void methodOverloaded(String s) { 
		System.out.println("Overloaded method may be static");
	}
	
	
	
	private void methodOverloaded(int i,String j) { 
		System.out.println("Private Method Overloaded");
	}
	//Duplicate method error
	/*
	 * int methodOverloaded(int i, int j) { return i;
	 * 
	 * }
	 */
	
	public static void main(String[] args) {  
		
		MethodOverloading_Rules m1 = new MethodOverloading_Rules();
		m1.methodOverloaded(1,"Shubhangi");
	}

}
