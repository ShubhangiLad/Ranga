class Testing2
{ static int i=1;

	/*Testing2(int i)
	{
		System.out.println(i);
		this.i=i;
	}*/
	Testing2(int t,int n)
	{
		
	}
	int i1=1;

	public void ff()
	{
	i1=24;
	System.out.println(i1);
	}
}
public class Constructor_Testing2 

{
	
	public static void main(String args[])
	{
		int a=23;
		Testing2 t=new Testing2(10,20);
		//Testing2 t1=new Testing2();
		t.ff();
		System.out.println(t.i);
		System.out.println(a);
		/*Testing2 t1=new Testing(34,35,35);*/
	}
}
