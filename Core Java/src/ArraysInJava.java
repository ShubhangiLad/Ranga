import java.util.Arrays;
class TestA{ 
	int i;
}
public class ArraysInJava {

	public static void main(String[] args) {
		
		TestA [] a = methodOne();
		System.out.println(a[2].i);
		System.out.println(a[5].i);
		
		byte[] b = {51, 22, 8, 37};          
		 
        Arrays.sort(b);     //sorts elements of the specified array in ascending order
 
        System.out.println(Arrays.toString(b)); 
	}
	
	static TestA[] methodOne() { 
		
		TestA[] a = new TestA[8];
		a[2] = new TestA();
		a[5] = new TestA();
		a[2].i= 10;
		a[5].i = 50;
		
		return a;
	}

}
