import java.util.ArrayList;

public class Generics_Example {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		list.add("Sushil");
		list.add("Shubhangi");
		list.add(7);
		list.add("Sonali");
		
		System.out.println(list);
		
		for(Object obj : list)
		{
			String s=(String)obj;
			System.out.println(s.length());
		}

	}

}
