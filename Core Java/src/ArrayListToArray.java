import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("Shubhangi");
	al.add("Eknath");
	al.add("Lad");
	System.out.println(al);
	Object [] array = al.toArray();
	System.out.println(Arrays.toString(array));
	
	for(Object o : al)
	{
		System.out.print(o+" ");
	}
	}

}
