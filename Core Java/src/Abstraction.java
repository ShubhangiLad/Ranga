abstract class AbstractClass {  
	static int im= 100;
	AbstractClass(){ 
		System.out.println("I am default constructor of Abstract class");
	}
	 abstract void abstractMethod();
	
	 
	 void concreteMethod() { 
		 System.out.println("I am in Concrete Method");
	 }
		 static void staticMethod() {
			 System.out.println("I am Static Method of Abstract class");
		 }
}
 abstract class AbstractClass2 extends AbstractClass{ 
	 abstract void abstractMethod2();
	 void abstractMethod() { 
			System.out.println("Implementation for Abstract Method");
		}
 }
 
class ConcreteClass extends AbstractClass2{ 
	 void abstractMethod2() {
		 System.out.println("Implementation of another Abstract Method");
	 };
}
public class Abstraction {
	public static void main(String [] args) { 
		
		ConcreteClass c = new ConcreteClass();
		c.abstractMethod();
		c.abstractMethod2();
		c.concreteMethod();
		c.staticMethod();
		System.out.println(AbstractClass.im);
		//We cannot create object of an Abstract class
		//AbstractClass a = new AbstractClass();
	}

}
