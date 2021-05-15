
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a1 = {1,2,3};
		int [] a2 = {4,5,6,7};
		
		System.out.println(a1 +" "+ a1.length);
		System.out.println(a2 +" "+ a2.length);
		
		a1=a2;
		
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a1[i]);
		}
		
		System.out.println(a1+" "+ a1.length);
		System.out.println(a2+" "+ a1.length);
		
	}

}
