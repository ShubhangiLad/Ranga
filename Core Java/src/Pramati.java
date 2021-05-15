
public class Pramati {

	public static void main(String[] args) {
		int [] a = {1};
		Pramati t = new Pramati();
		t.increment(a);
		System.out.println(a[a.length-1]);
		

	}
	void increment(int [] i) {
		i[i.length-1]++;
	}

}
