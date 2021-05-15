
interface Parent1 {
	int i = 10;
	void m1();
}

interface Parent2{ 
	/*
	 * static { System.out.println("SIB not allowed inside interface."); }
	 * 
	 * { System.out.println("IIB not allowed inside interface."); }
	 */
	void m2();
}

class Inheritance implements Parent1,Parent2 { 
	 public void m1() {
		 
		 int i = 100;
		 System.out.println(i);
		 System.out.println("Multiple Inheritance is achieved in Java");
	 }
	 
	 public void m2() { 
		 System.out.println("Achieved through Interface");
	 }
	 
}

public class MultipleInheritance { 
	public static void main(String [] args) {  
	
		Inheritance i = new Inheritance();
		i.m1();
	}
	
}
