package test2;
import test.A1;
class AccessModifier2 {

	public static void main(String[] args) {
		D1 d = new D1();
		d.methodOfClassD1();
		E1 e = new E1();
		e.methodOfClassE1();
	}
}

class D1 extends A1{   
	void methodOfClassD1()
	{
		//System.out.println(i);
		//System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		A1 a = new A1();
		//System.out.println(a.k); --Field A1.k is not visible
	}
}

class E1 extends D1{ 
	void methodOfClassE1() {   
		D1 d = new D1();
		//System.out.println(d.k);	
		System.out.println(d.l);
	}
	
}
