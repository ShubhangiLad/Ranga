import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shubhangi");
		list.add("Bhargavi");
		list.add("ashwin");
		list.add("Akshay");
		System.out.println("Arraylist before sorting");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Arraylist after sorting");
		System.out.println(list);
		System.out.println("ArrayList after ignoring case sensitiveness");
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);

	}

}
