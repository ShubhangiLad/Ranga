
public class JaggedArrays 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		int b[]= {4,5,6,7};
		int c[]= {8,9,0,1};
		int JaggedArray[][]= {a,b,c};
		for(int i=0;i<JaggedArray.length;i++)
		{
			System.out.print("{ ");
			for(int j=0;j<JaggedArray[i].length;j++)
			{
				System.out.print(JaggedArray[i][j]+" ");
			}
			System.out.print("}");
			System.out.println();
		}
	}

}
