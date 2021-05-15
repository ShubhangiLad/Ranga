
public class ArrayEquality {
	public static void main(String[] args) {

	int [] a1 = {1,2,3,4,5};
	int [] a2 = {2,1,3,4,5};
	int [] a3 = {1,2,3,4,5};
	int [] a4 = {1,2};
	
	boolean r1 = isArrayMatching(a1,a2);
	boolean r2 = isArrayMatching(a2,a3);
	boolean r3 = isArrayMatching(a1,a3);
	boolean r4 = isArrayMatching(a1,a4);
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r1+" "+r2+" "+r3+" "+r4);
	}
	public static boolean isArrayMatching(int[] a12, int[] a22) {
		boolean isMatching = true;
		if(a12.length==a22.length) { 
			for(int i=0;i<=a12.length-1;i++) { 
				if(a12[i]==a22[i]) { 
					continue;
				}
				else
					isMatching = false;
					break;
			}
		}
		
		else {
			isMatching = false;
		}
		
		return isMatching;
	}
}
