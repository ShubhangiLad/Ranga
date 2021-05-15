
public class AutoWidening {
	static float castingMethod(int i) { 
		long l = i;
		return l;
	}
public static void main(String [] args) { 
	byte b = 10;
	short s = b;
	double d = castingMethod(s);
	System.out.println(d);
}
}
