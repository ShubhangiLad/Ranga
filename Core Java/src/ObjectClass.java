
public class ObjectClass {

	public static void main(String[] args) {

		
		childClass c1 = new childClass(1,"Shubh");
		
		  childClass c2 = new childClass(1,"Shubh"); 
		  if(c1.equals(c2))
		  {
		  System.out.println("Equal"); 
		  } 
		  else
		  	{ 
			  System.out.println("Not equal");
			  }
		 
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1);
		System.out.println(c2);
	}

}

class childClass {
	
	int id;
	@Override
	public String toString() {
		return "childClass [id=" + id + ", name=" + name + "]";
	}

	String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		//System.out.println(result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		childClass other = (childClass) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public childClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	
}
