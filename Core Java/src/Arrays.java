class UserDefinedType{ 
	int i;
	void methodOne() { 
		System.out.println("From User Defined Type");
	}
}
public class Arrays {

	public static void main(String[] args) {   
		UserDefinedType[] arrayOfUserDefinedType = new UserDefinedType[10];
		for(int i=0;i<arrayOfUserDefinedType.length;i++) { 
			arrayOfUserDefinedType[i] = new UserDefinedType();
			System.out.println(arrayOfUserDefinedType[i]);
		}
		arrayOfUserDefinedType[2].methodOne();
	}
}
