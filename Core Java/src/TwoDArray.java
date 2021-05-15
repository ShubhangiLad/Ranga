
public class TwoDArray 
{
	public static void main(String args[])
	{
		int OneDArray1[]= {1, 2, 3};
		int OneDArray2[]= {4, 5, 6};
		int TwoDArray[][]= {OneDArray1, OneDArray2};

		{
		for(int i=0;i<TwoDArray.length;i++)
		{
			System.out.print("{");
			for(int j=0;j<TwoDArray[i].length;j++)
			{
				System.out.print(TwoDArray[i][j]);
			}
			System.out.print("}");
			System.out.println();
		}
		
		System.out.println();
		System.out.println(OneDArray1.length);
		}
	}
}
