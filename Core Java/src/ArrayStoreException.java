
public class ArrayStoreException {
	
	public static void main(String[] args)
	{
		//Here it will take type of reference variable while compiling, so 
		Object[] a = new Integer[3];
		a[0] = 1;
		a[1] = "Shubhangi";
		a[2] = 2;
		System.out.println(a);
	}

}
