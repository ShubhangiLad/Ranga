
public class enum_Singleton {

	public static void main(String[] args) {
		
		enum_Singleton_pattern obj1 = enum_Singleton_pattern.INSTANCE;
		obj1.i = 5;
		obj1.show();
		System.out.println(obj1);
		
		enum_Singleton_pattern obj2 = enum_Singleton_pattern.INSTANCE;
		obj2.i = 6;
		obj2.show();
		System.out.println(obj2);
	}

}

enum enum_Singleton_pattern{                             
	
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
}
