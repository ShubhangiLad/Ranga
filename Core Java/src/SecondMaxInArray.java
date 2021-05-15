import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMaxInArray {

	public static void main(String[] args) { 
		int [] a = {3,6,11,9,11,7};
		
		int max = a[0]; int secondMax = a[1];
		  if(a[1]>a[0]) { 
			  max = a[1]; 
			  secondMax = a[0]; 
		  }
		  else {  
			  max = a[0];
			  secondMax = a[1];
		  }
			  
		 for(int i=2;i<a.length;i++) { 
			 if(a[i]>max) { 
				 secondMax = max;
				 max = a[i];
			 }
			 else {
				 if(a[i]>secondMax) {
				 secondMax = a[i];
				 }
			 }		/*
					 * else { if(a[i]==max || secondMax==max) { secondMax= a[i-2]; } }
					 */
		 
		 }
		 System.out.println("2nd largest element is : "+secondMax);
		 
			Arrays.sort(a);
			int arrLength = a.length;
			System.out.println("2nd largest element using sort method : "+a[arrLength-2]);
			
			List<Integer> list = Arrays.asList();
			Collections.sort(list);
			System.out.println(list.get(a[arrLength-2]));
	}
}
