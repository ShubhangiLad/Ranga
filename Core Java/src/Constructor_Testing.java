class Testing
{
	Testing(int i)
	{
		System.out.println(i);
		System.out.println("Hello Constructor");
	}
	void Testing(int a)
	{
		System.out.println(a);
		System.out.println("Hello Method");
	}
}
public class Constructor_Testing
{
	public static void main(String args[])
	{
		Testing t=new Testing(10);
		t.Testing(24);
		t.Testing(12);
	}
}
