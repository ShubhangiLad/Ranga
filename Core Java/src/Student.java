import java.util.Comparator;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int percentage;
	
	public Student(int id,String name,int percentage)
	{
		this.id =id;
		this.name=name;
		this.percentage=percentage;
		
	}
	

	@Override
	public int compareTo(Student s) {
	
		return this.id-s.id;
	}
	
	public String toString()
	{
		return ("id : "+ id + " name : " + name +" percentage : "+ percentage);
	}

}

class OrderbyPercentage implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.percentage==s2.percentage)
		{ 
			return s1.name.compareTo(s2.name);
		}
		else
		{
			return s2.percentage-s1.percentage;
		}
	}
}
