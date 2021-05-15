class Reference
{
	int i;
	void methodone()
	{
		System.out.println("Class A");
	}
}
public class RefArray 
{

	public static void main(String[] args) 
	{
		Reference r[]=new Reference[3];
		for(int i=0;i<r.length;i++)
		{
			r[i]=new Reference();
			r[i].methodone();
		}
		
	}

}
