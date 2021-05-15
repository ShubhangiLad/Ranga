
public class Constructor_Inheritance {

	public static void main(String[] args) {
		B b = new B();

	}

}

class A
{
    int i;
 
    A(int i)
    {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A
{
    public B() {
		super(10);
		// TODO Auto-generated constructor stub
	}

	int j;
}
