package test2;
import java.util.*;
public class ArrayToArrayList {

	public static void main(String[] args) {
		Integer [] arr = {1,5,9,3,2,4};
		List list = Arrays.asList(arr);
		System.out.println(list);
		String [] str = {"Shubhangi","Lad","Hello","Hi","Bye"};
		List list1 = Arrays.asList(str);
		System.out.println(list1);
		int [] a = {3,5,1,5,6};
		List list2 = new ArrayList<Integer>(a.length);
		for(int i : a) {
			list2.add(i);
		}
		System.out.println(list2);
		String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

		List<String> al = new ArrayList<String>();

		Collections.addAll(al, geeks);

		System.out.println(al);
	}

}
