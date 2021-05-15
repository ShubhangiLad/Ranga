
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
	
		Integer a[] = {1,2,3,4,5};
		
		List<Integer> al = Arrays.asList(a);
		//List<Integer> al = Arrays.asList(ArrayUtils.toObject(array));
		
		System.out.println(al);
		
		/*
		 * String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
		 * 
		 * // Conversion of array to ArrayList // using Arrays.asList List al =
		 * Arrays.asList(geeks);
		 * 
		 * System.out.println(al);
		 */
		
		int[] ints = {1, 2, 3};
		List<Integer> intList = new ArrayList<Integer>(ints.length);
		for (int i : ints)
		{
		    intList.add(i);
		}
		System.out.println(intList);
	}

}
