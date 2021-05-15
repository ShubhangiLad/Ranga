
public class Array 
{
	public static void main(String args[])
	{
		int a[] =new int[3];
		a[2]=3;
		System.out.print("{ ");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.print("}");
	}
}
