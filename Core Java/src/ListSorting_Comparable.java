import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSorting_Comparable {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(76,"Shubhangi",97));
		list.add(new Student(111,"Anita",84));
		list.add(new Student(34,"Manuj",87));
		System.out.println("List before sorting by id");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("list after sorting by id");
		System.out.println(list);
		System.out.println("list before sorting by percentage");
		System.out.println(list);
		Collections.sort(list, new OrderbyPercentage());
		System.out.println("list after sorting by percentage");
		System.out.println(list);
		
	}

}


