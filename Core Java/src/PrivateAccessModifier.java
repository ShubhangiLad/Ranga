

public class PrivateAccessModifier {
	public static void main(String[] args) { 
		PrivateElements pe = new PrivateElements();
		System.out.println("Main Method");
	}

}

class PrivateElements{  
	private int i=10;
	
	private void privateMethod() { 
		System.out.println("I am Private Method");
	}
	
	private class PrivateClass{

		public void privateClassMethod() {
			System.out.println("Method inside private class");
			PrivateElements pe = new PrivateElements();
			pe.privateMethod();
		} 
		
	}
	
	class NewClass extends PrivateElements{ 
		PrivateElements pe = new PrivateElements();
		//pe.privateMethod();
	}
	
}
